package loops;
import java.text.DecimalFormat;
import java.util.Arrays;

public class LottozahlenArray {

	public static void main(String[] args) {
		// declare variables
		DecimalFormat f = new DecimalFormat("#0.00");
		int [] lottozahlen= new int[6];
		int lottoCand;
		boolean isDublicate;

		//fill array with 6 random numbers
		for (int i = 0; i < lottozahlen.length; i++) {
			do {
				isDublicate = false;	
				lottoCand = (int) (Math.random() * 10 +1);

				// for loop check for duplicate
				for (int j=0; j <i; j++) {
					if (lottoCand == lottozahlen[j]) {
						isDublicate = true;
					} 
				}
			} while (isDublicate);

			// asign lotto number
			lottozahlen[i] = lottoCand;
		}

		// sort numbers and print result
		Arrays.sort(lottozahlen);
		for (double ergebnis:lottozahlen) {
			System.out.print(f.format(ergebnis)+"; ");
		}
	}

}
