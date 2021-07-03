package tryCatch;
/*				OOP1 Slides3 p.43  Nutzereingaben & Taschenrechner
1.Experimentieren Sie mit den Methoden nextLine(), nextInt(), und nextDouble() der Klasse Scanner. 
2.Lesen Sie zwei Zahlen und einen arithmetischen Operator mit Hilfe der Klasse Scanner als double ein. 
Verwenden Sie if(<Bedingung>) {...} else [if (...)] {...}. Geben Sie das Ergebnis aus. 
3.Ergänzen Sie Ihr Programm um Kommentare.
 */

import java.util.Scanner;

public class NutzereingabeUndTaschenrechner {

	public static void main(String[] args) {
		// 1. Declare and initialize: operator, Operands, Scanner
		double op1=0, op2=0, result =0.0;
		String operator = "";
		Scanner scan = new Scanner (System.in);

		// 2. Read input
		try {
			System.out.println("Enter first operand: ");
			op1 = scan.nextDouble();
			System.out.println("Enter second operand: ");
			op2 = scan.nextDouble();	
			System.out.println("Enter operator (*,/,+,-,%): ");
			operator = scan.next();
		} catch (Exception e) {
			System.err.println("Something went wrong...");
		}

		// 3. Decide and compute
		if (operator.equals("+")){	result=op1+op2;
		} else if (operator.equals("-")) {	result=op1-op2;
		} else if (operator.equals("*")) {	result=op1*op2;		
		} else if (operator.equals("/")) {	result=op1/op2;			
		} else if (operator.equals("%")) {	result=op1%op2;			
		} else { System.out.println("Operator " + operator + " unknown!");
		}

		System.out.println("Ergebnis: " +result);

		// 4. Close resources
		scan.close();


	}

}
