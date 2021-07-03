package recursion;

public class QuersummeIterativRekursiv {

	public static void main(String[] args) {
		//declare variables
		int zahl=123;

		//call methods
		System.out.println(quersumme(zahl));
		System.out.println(quer(zahl));
	}

	public static int quersumme(int zahl) {
		//declare variables
		int erg=0, x=0;

		//loop
		do {
			x=zahl%10;
			zahl=zahl/10;
			erg+=x;
		}while(zahl!=0);

		return erg;
	}

	public static int quer (int zahl) {
		//recursion
		if (zahl <= 9) return zahl;

		return zahl%10 + quer(zahl/10);
	}

}
