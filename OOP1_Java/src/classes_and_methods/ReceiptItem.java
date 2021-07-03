package classes_and_methods;

public class ReceiptItem {
	//variables
	private String itemName;		//Ergibt private hier Sinn??
	private int itemNumber;
	private double itemPrice;

	//constructor
	public ReceiptItem (String name, int number, double price) {
		itemName=name;
		itemNumber=number;
		itemPrice=price;
	}

	//getters
	public String getItemName() {
		return itemName;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public double getItemPrice() {
		return itemPrice;
	}

}
