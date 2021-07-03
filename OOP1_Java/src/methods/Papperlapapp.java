package methods;

/*
 * Schreiben Sie eine Methode, die beliebiges Wort und einen beliebigen Buchstaben übergeben bekommt und zurückgibt, 
 * wie oft der Buchstabe in dem Wort vorkommt (Nicht Case-Sensitiv). 
 * • Beispiel: 
 * • Input: Papperlapapp, p 
 * • Output: 6 
 */
public class Papperlapapp {

	public static void main(String[] args) {
		//declare variables
		System.out.println(letterCounter("papperlapapp"));
	}
	public static int letterCounter (String word) {
		//declare variables
		int result=0;
		String buchstabe="p";
		char b = buchstabe.charAt(0);
		
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i)==b) { 
				result++;
			}
		}

		return result;
	}

}
