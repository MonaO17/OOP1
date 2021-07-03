package methods;

import java.util.Arrays;

/*						OOP1 Slides7 p.18 Teil 1 Übung checkUnique()– mit Array
  1. Legen Sie ein eindimensionales Integer-Array der Länge 10 an und füllen Sie 10 Elemente mit einer Zufallszahl 
  zwischen eins und 100. 
  2. Schreiben Sie eine Methode boolean checkUnique( Integer[] arr), die dieses Array als Input erhält und prüft, 
  ob alle Zahlen im Array voneinander verschieden sind. Falls ja, wird true zurück gegeben, sonst false. 
 */

public class CheckUnique3 {

	public static void main(String[] args) {
		// declare variables
		int arr []= new int[10];						//1. eindimesionales Integer-Array
		for (int i=0; i<arr.length; i++) {				//gefüllt mit 10 Zufallszahlen zwischen 1 & 100
			arr [i] = (int)(Math.random()*100+1);			
		}

		boolean isUnique=checkUnique(arr);				//Methode checkUnique wird aufgerufen und das Integer-Array "arr" übergeben

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)+"\nIs unique: "+isUnique);
	}

	private static boolean checkUnique (int [] arr) {

		// sort the array
		Arrays.sort(arr);

		// search for a pair of equal values
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return false;
			}
		}

		return true;
	}
}


