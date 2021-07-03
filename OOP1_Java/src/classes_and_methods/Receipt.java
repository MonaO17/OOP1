package classes_and_methods;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Receipt {
	//variables
	private String receiptTitle;		//Ergibt private hier Sinn??
	private ArrayList <ReceiptItem> list = new ArrayList <ReceiptItem>();

	//constructor
	public Receipt(String title) {
		receiptTitle=title;
	}

	//add receipt item 
	public void add(ReceiptItem receiptItem) {
		list.add(receiptItem);
	}

	//print receipt
	public void print() {
		//variables
		double sum=0;
		DecimalFormat f = new DecimalFormat("#0.00");

		//receipt
		System.out.println("Thank you for shopping at the "+receiptTitle+",\nHere is your receipt:\n");
		System.out.println("***"+receiptTitle+"***\n- - -");
		for (ReceiptItem ri: list) {
			System.out.print(ri.getItemName());
			System.out.print("\t"+ri.getItemNumber()+"x");
			System.out.println("\t"+ri.getItemPrice()+"€");
			sum+=ri.getItemNumber()*ri.getItemPrice();
		}
		System.out.println("- - -");
		System.out.println("Summe: \t\t"+f.format(sum)+"€");

	}


}
