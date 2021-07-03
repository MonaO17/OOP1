package methods;
/*						OOP1 Slides7 p.18 Teil 2 Übung checkUnique()– mit Array
  1. Legen Sie ein eindimensionales Integer-Array der Länge 10 an und füllen Sie 10 Elemente mit einer Zufallszahl 
  zwischen eins und 100. 
  2. Schreiben Sie eine Methode boolean checkUnique( Integer[] arr), die unmittelbar nach jeder erzeugten Zufallszahl 
  aufgerufen wird. Übergeben Sie dabei als zusätzlichen Parameter die zuletzt veränderte Position, 
  z. B. boolean checkUnique( Integer[], int pos ) und überprüfen Sie nur, ob die neu eingefügte Zahl von allen 
  anderen verschieden ist. Falls nicht, erzeugen Sie eine Neue.
 */
import java.util.Arrays;
public class CheckUnique2 {

	public static void main(String[] args) {
		// declare variables
		int arr []= new int[10];						//1. eindimesionales Integer-Array
		do{for (int i=0; i<arr.length; i++) {			//gefüllt mit 10 Zufallszahlen zwischen 1 & 100
			arr [i] = (int)(Math.random()*100+1);			
		}}while(!checkUnique(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
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