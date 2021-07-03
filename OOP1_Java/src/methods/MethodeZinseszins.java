package methods;

import java.util.Scanner;

/* * Schreiben Sie eine Methode für die Berechnung von Zinseszinsen. https://de.wikipedia.org/wiki/Zinseszins 
 * Parameter sind Anfangskapital, Zinssatz und Laufzeit in Jahren. 
 * • Beispiel: 
 * • Input: 20000, 2.9, 7 
 * • Output: 24.430,80
 */

public class MethodeZinseszins {
	static double zinssatz = 2.9;

	public static void main(String[] args) {
		//declare variables
		double anfangskapital=0;
		int laufzeit=0;
		Scanner scan = new Scanner (System.in);

		//get data
		System.out.println("Wie hoch ist Ihr Anfangskapital? ");
		anfangskapital= scan.nextDouble();
		System.out.println("Wie viele Jahre wollen Sie sparen? ");
		laufzeit= scan.nextInt();

		//call methods
		System.out.println("In "+laufzeit+" Jahren hätten Sie: "+zinseszins(anfangskapital, laufzeit)+" Euro!");
		System.out.println("In "+laufzeit+" Jahren hätten Sie: "+zZins(anfangskapital, laufzeit)+" Euro!");

		//close resources
		scan.close();

	}
	public static double zinseszins(double anfangskapital, int laufzeit) {
		//declare variables
		double zinseszins=0.0;

		//zinseszins berechnen
		zinseszins=anfangskapital*(Math.pow(1+zinssatz/100, laufzeit));

		return zinseszins;
	}

	public static double zZins(double anfangskapital, int laufzeit) {
		//zinseszins rekursiv berechnen
		if(laufzeit==0) {
			return anfangskapital;
		}else {
			anfangskapital=anfangskapital+((anfangskapital*zinssatz)/100);
			return zZins(anfangskapital, laufzeit-1);
		}
	}

}
