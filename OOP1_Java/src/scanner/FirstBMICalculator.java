package scanner;
//			OOP1 Übung im Klassenraum - BMI-Rechner erstellen

import java.util.Scanner;

public class FirstBMICalculator {

	public static void main(String[] args) {
		// 1) Declare variables
		
		String Prename, MiddleName, LastName;
		String Studies;
		double High, Weight, BMI;
	
		// 2) Ask questions and gather information
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("Geben Sie Ihren Vornamen ein: ");
		Prename = scan.next();
		System.out.println("Geben Sie Ihren Zweitnamen ein: ");
		MiddleName = scan.next();
		System.out.println("Geben Sie Ihren Nachnamen ein: ");
		LastName = scan.next();
		System.out.println("Geben Sie Ihr Alter ein: ");
		scan.next();
		System.out.println("Geben Sie Ihren Studiengang ein: ");
		Studies = scan.next();
		System.out.println("Gehen Sie regelmäßig zum Sport?");
		scan.next();
		System.out.println("Vielen Dank! Ihre Daten werden verarbeitet!");
		System.out.println("Kommen wir nun zu Ihrem BMI");
		System.out.println("Geben Sie Ihre Körpergröße in m an: ");
		High = scan.nextDouble();
		System.out.println("Geben Sie Ihr Körpergewicht in Kg an: ");
		Weight = scan.nextDouble();
		BMI = Weight / (High*High);
		System.out.printf("Ihr BMI beträgt: %.2f", BMI);
		System.out.println(" ");
		
		// 3) Personalized Advertisement
		if (BMI>25) {
			System.out.print((Prename)+(" ")+(MiddleName)+(" ")+(LastName)+", interessieren Sie sich für "
					+ "unsere neusten UNI-Sportangebote für Anfänger? Diese lassen sich ausgezeichnet mit "
					+ "Ihrem Studiengang "+Studies+" kombinieren!!!");
		} else {
			System.out.print((Prename)+(" ")+(MiddleName)+(" ")+(LastName)+", "
					+ "interessieren Sie sich für unsere neusten UNI-Sportangebote für Fortgeschrittene? "
					+ "Diese lassen sich ausgezeichnet mit Ihrem Studiengang "+Studies+" kombinieren!!!");
			
		// 4) Close resources
			scan.close();
		}
	}

}
