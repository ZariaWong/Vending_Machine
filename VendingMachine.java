import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachine {
// ArrayList of Integers represents inserted coins in Coin Slot
	ArrayList<Integer> insertedCoins;
// ArrayList of Product represents inventories of products
	ArrayList<Product> products;
	ArrayList<Integer> changedCoins;
	ArrayList<Integer> Coinslist = new ArrayList<>(Arrays.asList(10,5,2,1));
	
	public int facevalue =0;
	
	public VendingMachine() {
		insertedCoins = new ArrayList<Integer>();
		products = new ArrayList<Product>();
		changedCoins = new ArrayList<Integer>();
	}

	public void addProduct(Product p) {
		products.add(p);
	}

	public void insertCoin(Integer c) {
		insertedCoins.add(c);
		facevalue+=c;
	}
	/* You may add other properties and methods */
}