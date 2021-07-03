package recursion;

public class FakultaetIterativUndRekursiv {

	public static void main(String[] args) {
		// declare variables
		int number=5;

		//call methods
		System.out.println(fakultaet(number));
		System.out.println(faku(number));
	}

	public static long fakultaet(int number) {
		//declare variables
		long erg=1;

		//get result with for-loop
		for(int i=1; i<=number; i++) {
			erg= erg*i;
		}
		return erg;
	}

	public static long faku (int number) {
		//get result with recursion
		if (number<=1)
			return 1;
		else
			return number*faku(number-1);
	}

}
