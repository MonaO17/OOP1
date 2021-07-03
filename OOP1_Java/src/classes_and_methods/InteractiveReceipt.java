package classes_and_methods;
import java.util.Scanner;

public class InteractiveReceipt {

	public void add(ReceiptItem receiptItem) {
		//declare variables
		String receiptTitle="HWR Kiosk";
		Scanner scan= new Scanner(System.in);
		String answer;
		int number;
		double price;
		boolean ans=true;

		String[] allItems= {"Steaks", "Cheese", "Milk", "Orange juice", "Magnum", "Florida IceCream"};
		double[] allPrices= { 3.99, 2.50, 1.39, 1.98, 2.99, 4.50};

		System.out.println("Hey, how are you? Welcome to the "+receiptTitle);

		for (int i=0; i<allItems.length;) {
			do {	
				System.out.println("Would you like to buy: "+allItems[i]+" ? (\"Yes\" or \"No\")");
				answer=scan.nextLine();
				if (answer.equalsIgnoreCase("Yes")) {
					System.out.println("How many "+allItems[i]+ " would you like to buy?");
					number=scan.nextInt();
					scan.nextLine();
					price=number*allPrices[i];
					ans=true;
					i++;
				} else if (answer.equalsIgnoreCase("No")) {
					ans=true;
					i++;
				} else {
					System.out.println("Sorry, I didn't understand you! Let's try again: ");
					ans=false;
				}
			}while(ans==true);

		}
	}
	
}
