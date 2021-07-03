package loops;
/*				OOP1 Slides4 p.20 Fakultät mit For-Schleife
Berechnen Sie mit Hilfe einer For-Schleife die Fakultät einer Zahl. Die Zahl soll eingegeben werden. 
Welche Eingabewerte können Sie ohne Überlauf berechnen? 
*/
import java.util.Scanner;

public class ForFakultät {

	public static void main(String[] args) {
		//declare variables
		long eingabe=0, ergebnis=1;
		Scanner scan= new Scanner(System.in);
		
		//ask for number
		System.out.println("Geben Sie eine Zahl ein, deren Fakultät Sie gerne wüssten!");
		eingabe=scan.nextLong();

		//for-Schleife
		for (int f=1; f<=eingabe; f++) {	
		ergebnis=ergebnis*f; }
		
		//output
		System.out.println(eingabe+"! ist: "+ ergebnis);
		
		//close resources
		scan.close();
	}
}

