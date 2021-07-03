package tryCatch;
/*				OOP1 Slides4 p.5 Umwandlung von Pint in Milliliter 
Definieren Sie den Umrechnungsfaktor als Konstante (1 Pint = 480 Milliliter):
	1. Rechnen Sie den Wert 17,5 Pint um 
	2. Erweitern Sie Ihr Programm so, dass der Anwender zur Eingabe einer bestimmten Menge 
	   in Pint aufgefordert wird und geben Sie den umgerechneten Wert aus
Gibt der Anwender keinen numerischen Wert ein, tritt bei der Konvertierung ein Laufzeitfehler auf.
Fangen Sie den Fehler durch einen try-catch-Block ab und geben Sie eine Fehlermeldung aus
*/
import java.util.Scanner;

public class PintInMilliliter {

	public static void main(String[] args) {
		// declare variables
		double factor=480, answer=0;
		Scanner scan = new Scanner(System.in);
		
		// ask question and convert string to double
		try {	System.out.println("Geben Sie eine Zahl in Pint an: ");
				answer=scan.nextDouble();
				System.out.println(answer+" Pint sind "+answer*factor+"ml"); 
		}catch (Exception zwei){ System.err.println ( "Fehlerhafte Eingabe: " + answer); 
		}
	
		//close resources
		scan.close();
	}
}
