package recursion;

public class FibonacciRekursiv {

	public static void main(String[] args) {
		//variables	
		int zahl=20;

		for(int i=0; i<zahl; i++) {
			System.out.print(fibonacci(i)+", ");
		}

	}
	public static int fibonacci(int zahl) {

		//fibonacci
		if(zahl == 0 || zahl == 1) {
			return 1;
		} else {
			return fibonacci(zahl-1) + fibonacci(zahl-2);
		}
	}

}
