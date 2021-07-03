package loops;
/*							OOP1_Slides6 p.17 Übung Lottozahlen
1. Erstellen Sie ein Programm, das in einer for-Schleife sechs Zahlen zwischen eins und 49 ausgibt. 
	Nutzen Sie dazu die Methode Math.random() oder nextInt() der Klasse Random 
2. Erweitern Sie Ihr Programm so, dass die Zahlen sortiert ausgegeben werden. 
	(Hinweis: Ein Array der Länge sechs nebst der Methode Arrays.sort() könnte hilfreich sein) 
3. Stellen Sie sicher, dass keine Zahl doppelt gezogen wird
 */
import java.util.Arrays;

public class Lottozahlen {

	public static void main(String[] args) {
		// clarify variables
		int [] lotto = new int [6];

		// random lotto numbers
		for (int i = 0; i < lotto.length; i++) {

			// gerarate non-duplicate new lotto number
			int lottoCand;
			boolean isDublicate;
			do {
				// gernerate until not dublicate
				isDublicate = false;
				lottoCand = (int) (Math.random() * 49 +1);

				// for loop check for dublicate
				for (int j=0; j <i; j++) {
					if (lottoCand == lotto[j]) {
						isDublicate = true;
					}
				}
			} while (isDublicate);

			// asign lotto number
			lotto[i] = lottoCand;
		}

		// sort numbers
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));

	}

}
