package loops;
/*								OOP1_Slides6 p.14 Übung Durchschnittsberechnung I
Schreiben Sie ein Programm, das den Durchschnitt aus mehreren Fließkommazahlen berechnet. Legen Sie dazu ein Array von Typ double an und initialisieren Sie es mit geeigneten Werten, z. B. 
double[] ad = { 2.7, 3.9, . . . };
Geben Sie den Durchschnitt sowie die Größe des Arrays, d. h. die Anzahl in die Berechnung eingeflossener Werte mit println() oder showMessageDialog()aus
 */

public class Durchschnittsberechnung {

	public static void main(String[] args) {
		//variablen deklarieren
		double[]ad= new double[60];
		for(int i=0; i<ad.length; i++){			//Array kann nicht diekt mit Math.rondom initialisiert werden, 
			ad[i]=Math.random()*6;				//sondern braucht for-Schleife
		};
		double summe=0;

		//Durchschnitt berechnen
		System.out.println("Der Notendurchschnitt beträgt: ");
		for( double einzelneZahl : ad) {					//Schleife zieht sich alle Zahlen einzeln aus dem Array
			System.out.println(einzelneZahl);				//Größe des Arrays ausgeben
			summe+=einzelneZahl;
		}		
		System.out.println(Math.round(summe/ad.length));	//Durchschnitt: summe=summe+einzelne Zahl (Alle einzelnen Zahlen werden addiert)
		//Teile die Summe durch die Länge des Arrays


	}	

}
