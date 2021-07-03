package methods;
/*							OOP1 Slides7 p.8 ÜbungcheckLow()
 *1. Berechnen Sie eine Serie von Zufallszahlen zwischen eins und 100. Schreiben Sie eine Methode 
 * boolean checkLow( Integer zahl), die diese Zahl als Input erhält und prüft, ob diese Zahl kleiner ist als 50. 
 * Falls ja, wird true zurück gegeben, sonst false. 
 *2. Schreiben Sie ein Programm, das 6 Zufallszahlen zwischen
 * 1 und 100 berechnet und checkLow() unmittelbar nach jeder erzeugten Zufallszahl solange aufruft, 
 * bis es true zurückgibt. Erst dann wird die Zahl ausgegeben.
 */
public class CheckLow {

	//Im Hauptprogramm werden die Zufallszahlen berechnet
	public static void main(String[] args) {
		//declare variables
		int zufallsZahl=0;
		for (int i=0; i<6;i++) {
			do{ zufallsZahl=(int)(Math.random()*100+1);
			} while (!checkLow(zufallsZahl));				//Wenn checkLow 
			System.out.print(zufallsZahl+"\t");
		} 

	}
	//In der Methode wird <50 entschieden
	static boolean checkLow (Integer zufallsZahl) {
		if (zufallsZahl<50) { return true;
		}else {return false;
		}		

	}
}
