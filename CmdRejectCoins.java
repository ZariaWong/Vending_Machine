import java.util.Comparator;
public class CmdRejectCoins implements Command {

	@Override
	public String execute(VendingMachine v, String[] cmdParts) {
		int tempvalue=v.facevalue;
		String coinsreturned = "";
		v.insertedCoins.sort(Comparator.naturalOrder());
		int l=0;
		for (int x :  v.insertedCoins) {
			String s=Integer.toString(x);
			coinsreturned+="$";
			coinsreturned+=s;
		    if (l<v.insertedCoins.size() - 1) {
		    	coinsreturned += ", ";
		    }
		    else {
		    	coinsreturned += ". $";
		    }
		    l+=1;
		}
		v.insertedCoins.clear();
		v.facevalue=0;
		if (coinsreturned!="") {
			return("Rejected "+coinsreturned+tempvalue+" in total.");
		}
		else {
			return("Rejected no coin!");
		}
	}	
}
