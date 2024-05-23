
import java.util.Comparator;

public class CmdPurchase implements Command {
	@Override
	public String execute(VendingMachine v, String[] cmdParts) {
		String s =cmdParts[1];
		int price = 0;
		int quantity=0;
		String name = null;
		String coinsreturned="";
		
		for (Product x :  v.products) {
			if (x.name.equals(s)==true)
			{
				price=x.price;
				quantity=x.quantity;
				name=x.name;
			}
		}
		if (quantity<=0) {
			return(name+" is out of stock!");
		}
		else {
			v.insertedCoins.clear();
			int tempvalue=v.facevalue;
//			System.out.println(tempvalue);
			if (v.facevalue<price) {
				return("Not enough credit to buy "+name+"! Inserted $"+
						tempvalue+" but needs $"+price+".");
			}
			else {
				if (v.facevalue==price) {
					for (Product x :  v.products) {
						if (x.name.equals(s)==true)
						{
							x.quantity-=1;
						}
					}
					v.facevalue=0;
					return("Dropped "+name+". Paid $"+price+". No change.");
				}
				else {
					v.facevalue-=price;
					for (int x :  v.Coinslist) {
						while (v.facevalue>=x) {
							v.changedCoins.add(x);
							v.facevalue-=x;
						}
					}
					v.changedCoins.sort(Comparator.naturalOrder());
					int l=0;
				    for (int y: v.changedCoins) {
				    	coinsreturned+="$";
				    	String s1=Integer.toString(y);
				    	coinsreturned+=s1;
					    if (l<v.changedCoins.size() - 1) {
					    	coinsreturned += ", ";
					    }
					    else {
					    	coinsreturned += ".";
					    }
					    l+=1;
				    }
					for (Product x :  v.products) {
						if (x.name.equals(s)==true)
						{
							x.quantity-=1;
						}
					}
					v.facevalue=0;
					return("Dropped "+name+". Paid $"+tempvalue+". Your change: "+coinsreturned);
				}
			}
		}
	}
}
