package tryCatch;

import java.util.Scanner;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// unchecked exceptions können mit try-catch Blöcken aufgefangen werden
		Scanner scan = new Scanner(System.in);

		try { 
			System.out.println("Gib eine Zahl ein: ");
			int a=scan.nextInt();
			System.out.println("Gib eine Zahl ein: ");
			int b=scan.nextInt();							//wenn der user als 2. eine 0 eingibt kommt ein error, deshalb brauchen wir den try-catch block
			System.out.println(a+" : "+b+" = "+(a/b));
		} catch (ArithmeticException ae) {
			System.out.println("Die 1. Zahl darf nicht unter 10 sein!");
		} finally {
			System.out.println("Das hier wird immer ausgegeben!");
		}
		
		scan.close();

	}

}
