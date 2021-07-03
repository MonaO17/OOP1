package methods;

public class NumberPalidrome {

	public static void main(String[] args) {
		//declare variables
		int zahl = 12321, zahl2 = 1782, zahl3 = 112211;

		System.out.println(zahl+ " is palidrome is: "+isPalidrom(zahl));
		System.out.println(zahl2+ " is palidrome is: "+isPalidrom(zahl2));
		System.out.println(zahl3+ " is palidrome is: "+isPalidrome(zahl3));

	}

	public static boolean isPalidrom (int zahl) {

		int zahlUmgekehrt = Integer.parseInt(new StringBuffer(String.valueOf(zahl)).reverse().toString());

		if (zahlUmgekehrt==zahl) {
			return true;
		}else {
			return false;
		}

	}
	public static boolean isPalidrome(int zahl) {
		String word= String.valueOf(zahl);
		StringBuilder sb=new StringBuilder(word);
		
		if(sb.reverse().toString().equals(word)) {
			return true;
		}else {
			return false;
		}
	}
}
