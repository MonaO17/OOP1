package loops;
/*						OOP1_Slides5 p.13 Übung Texteingabe
-Ihr Programm soll einen Text einlesen mit mindestens 20 Zeichen. 
-Solange es weniger als 20 Zeichen sind, soll das Programm die erneute Eingabe fordern. 
-Wenn es sogar weniger als 10 Zeichen sind, soll das Programm „Geht es noch sparsamer, 20 Zeichen habe ich 
gefordert!“ ausgeben. 
-Das Programm soll den eingegebenen Text ausgeben, zuvor jedoch jedes ‚e‘ durch ‚elefe‘ ersetzen	
 */

import java.util.Scanner;

public class SchleifeTexteingabe {

	public static void main(String[] args) {
		// declare variables
		Scanner scan= new Scanner(System.in);
		String text;

		System.out.println("Geben Sie einen Satz mit 20 Zeichen ein!");
		do {text=scan.nextLine();
		if (text.length()<10) {System.out.println("Geht es noch sparsamer, 20 Zeichen habe ich gefordert!");
		} else if (text.length()>10 && text.length()<20) { System.out.println("Zu kurz...");
		} else {System.out.println("Gut gemacht! Ihr Satz lautet: "+text);}
		}while (text.length()<20);


		//close resources
		scan.close();
	}}