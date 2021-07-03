package methods;
/*					Übung Methode Kleinste Zahl
	Schreiben Sie eine Methode, die die kleinste von drei Zahlen zurückgibt.
  	Beispiel: 	Input: 45, 56, 83
  				Output: 45										
 */

import java.util.Arrays;

public class MethodeKleinsteZahl {

	public static void main(String[] args) {
		//declare variables
		int [] zahlen = {24, 29, 55, 21, 39, 92, 18, 23};

		//Print out smallest number from method kleinste
		System.out.println(kleinste(zahlen));
	}

	public static int kleinste (int [] zahlen) {

		Arrays.sort(zahlen);		

		return zahlen[0];	
	}
}
