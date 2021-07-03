package loops;
/*				OOP1 Slides4 p.18 While-Schleife
 *Sie beabsichtigen von Ihrem sauer verdienten Geld jedes Jahr € 2.500,- zu sparen (am Jahresanfang). 
 *Sie rechnen mit einem Zinssatz von 5%. Ermitteln Sie mit Hilfe einer while-Schleife, 
 *wie viele Jahre Sie sparen müssen, bis Sie die 50.000 Euro für Ihr Wunschauto zusammen haben!
 */

import java.util.Scanner;

public class WhileGeldanlagenberatung {

	public static void main(String[] args) {
		//Variablen deklarieren
		double anfangssumme=0, monat=0, zinssatz=1.05, endsumme=0, zielsumme=0;;
		int jahr=0;
		Scanner scan = new Scanner(System.in);

		//Ermittle Anfangssumme
		System.out.println("Wie viel Geld können Sie jeden Monat beiseite legen?");
		monat = scan.nextDouble();
		anfangssumme = (monat*12);

		//Ermittle Endsumme
		System.out.println("Wie viel Geld wollen Sie sparen?");
		zielsumme = scan.nextDouble();

		//Berechne Anzahl Jahre
		while(endsumme<zielsumme) {
			endsumme = ((anfangssumme+endsumme)*zinssatz);
			jahr++;		
		} System.out.println("Es dauert: "+jahr+" Jahre bis Sie Ihr Sparziel mit einem Zinssatz von 5% erreicht haben!");

		// Close resources
		scan.close();
	}
}
