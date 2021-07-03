package substrings;
/*						OOP1 Slides4 p.22 Quersumme berechnen
Erstellen Sie eine Anwendung, die vom Anwender eine ganze Zahl anfordert und berechnen Sie die Quersumme 
dieser Zahl. Die einzelnen Ziffern erhalten Sie mit Hilfe der Methode substring(). 
Geben Sie das Ergebnis mit println() aus.
 */
import java.util.Scanner;
public class Quersumme {

	public static void main(String[] args) {
		// variablen deklaration
		Scanner scan = new Scanner(System.in);
		String s;
		System.out.println("Geben Sie eine Zahl (ohne Komma) ein!");
		s = scan.nextLine();
		int querSumme=0;

		//Rechnung substring und length
		for(int i=0; i<s.length(); i++) {
			String zifferAsString= s.substring(i, i+1);
			System.out.println("Aktuelle Ziffer: "+zifferAsString);
			int ziffer = Integer.parseInt(zifferAsString);
			System.out.println("Verdoppelt: "+(ziffer*2));
			querSumme+= ziffer;
		}
		System.out.println("Quersumme: "+querSumme);

		//
		scan.close();

	}

}
