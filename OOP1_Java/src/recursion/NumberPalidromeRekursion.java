package recursion;

public class NumberPalidromeRekursion {

	public static void main(String[] args) {
		//declare variables
		int zahl = 12321, zahl2 = 1782, zahl3 = 11211;

		System.out.println(zahl+ " is palidrome is: "+isPalidrome(zahl));
		System.out.println(zahl2+ " is palidrome is: "+isPalidrome(zahl2));
		System.out.println(zahl3+ " is palidrome is: "+isPalidrome(zahl3));

	}

	public static boolean isPalidrome(int zahl) {
		String word=String.valueOf(zahl);

		if(word.length()<2) {
			return true;
		}
		if (word.charAt(0) != word.charAt(word.length()-1)) {
			return false;
		}
		else { int kleinereZahl=Integer.valueOf(word.substring(1, word.length()-1));
		return isPalidrome(kleinereZahl);
		}

	}

}
