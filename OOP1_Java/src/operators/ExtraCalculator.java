package operators;
//			OOP1 Übung Vorlesung - einfachen Rechner erstellen

import java.util.Scanner;

public class ExtraCalculator {

	public static void main(String[] args) {
		// 1) Declare variables for name and age
		int VariableOne;
		int VariableTwo;
		int Sum;
		int Product;

		//2) Read with scanner
		Scanner scan;
		scan = new Scanner (System.in);						//Eine neue Instanz der Klasse Scanner

		System.out.println("Geben Sie eine Zahl ein:");
		VariableOne = scan.nextInt();
		System.out.println("Geben Sie eine weitere Zahl ein:");
		VariableTwo = scan.nextInt();
		System.out.println("Summe:");
		Sum = VariableOne + VariableTwo;
		System.out.println(Sum);
		System.out.println("Produkt:");
		Product = VariableOne * VariableTwo;
		System.out.println(Product);

		//3) Close Resources
		scan.close();
	}

}
