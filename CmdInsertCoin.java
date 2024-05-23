public class CmdInsertCoin implements Command {
	@Override
	public String execute(VendingMachine v, String[] cmdParts) {
		String s =cmdParts[1];
		int c = Integer.parseInt(s);
// Add the coin to Coin Slot
		v.insertCoin(c);
		return ("Inserted a $"+ c + " coin. $"+ v.facevalue +" in total.");
// x and y must be replaced by an appropriate value
	}
}
