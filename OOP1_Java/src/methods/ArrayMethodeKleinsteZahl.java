package methods;

import java.util.Arrays;

/*
 * Schreiben Sie eine Methode, die die kleinste Zahl in einem Array von Zahlen zurückgibt. 
 * • Beispiel: 
 * • Input: [45, 56, 83, 15, 72, 27, 33, 37 
 * • Output: 45 
 */

public class ArrayMethodeKleinsteZahl {

	public static void main(String[] args) {
		//declare variables
		int[]allNumbers = {45, 56, 83, 15, 72, 27, 33, 37};

		//get smallest number
		System.out.println(smallest(allNumbers));
	}
	public static int smallest (int[]allNumbers) {
		//declare variables
		int smallest=0;

		//get smallest Number
		Arrays.sort(allNumbers);
		smallest =allNumbers[0];

		return smallest;
	}

}
