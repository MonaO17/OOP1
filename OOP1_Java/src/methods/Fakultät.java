package methods;
/*						OOP1 Slides7 p.11 Übung Fakultät
1.Schreiben Sie eine Anwendung zur Fakultätsberechnung. Die Berechnung soll in einer  Methode fakultaet() erfolgen 
2.Zeigen Sie anhand eines kleinen Demoprogramms, dass Java beim Methodenaufruf die Parameter by value und nicht 
by reference übergibt 
 */
import java.util.Scanner;

public class Fakultät {

	public static void main(String[] args) {
		// define variables
		int n = 0;
		Scanner scan= new Scanner(System.in);
		
		//get number
		System.out.println("Von welcher Zahl wollen Sie die Fakultät berechnet haben?");
		n= scan.nextInt();
		
		//get result from method fakultaet
		long ergebnis = fakultaet( n ); 
		System.out.println( n + "!=" + ergebnis);
		
		//close resources
		scan.close();
	}

	static long fakultaet(int n) {
		// calculate fakultät
		long erg = 1; 
		for( int i = 2; i <= n; i++ ) 
			erg *= i; 

		return erg; 	
	}
}

