package loops;
/*						OOP1 Slides5 p.3 Kreditkartenüberprüfung
*Mit Hilfe des sog. Luhn-Algorithmus (nach Hans Peter Luhn) lässt sich überprüfen, ob eine 
*Kreditkartennummer syntaktisch korrekt ist. Der Algorithmus ist einfach: 
*1. Verdoppeln Sie jede zweite Ziffer der Kartennummer. Starten Sie dabei am Ende der Nummer 
*2. Ist eine Ziffer durch die Verdopplung zweistellig geworden, subtrahieren Sie 9 
*3. Addieren Sie alle Ziffern 
*4. Ist die Summe ein Vielfaches von 10, ist die Kartennummer korrekt, sonst nicht!
*
*-Überprüfen Sie mit Hilfe des Luhn-Algorithmus, ob die Kartennummern 1234 5678 9012 3456
* und 4408 0412 3456 7893 korrekt sind
*-Erweitern Sie Ihr Programm so, dass die Eingabe der Kartennummer durch den Anwender erfolgt 
*a) Aus Gründen der Vereinfachung sollen dabei nur Ziffern ohne Trennzeichen eingegeben werden 
*b) Falls Sie die Herausforderung suchen: Lassen Sie auch das Minuszeichen oder andere Zeichen als 
*Trennzeichen zwischen den Ziffernblöcken zu, also z. B. 4408-0412-3456-7893
 */
import java.util.Scanner;

public class KreditkartenÜberprüfung {

	public static void main(String[] args) {
		// declare variables
		Scanner scan = new Scanner(System.in);
		String creditCard;
		int result=0, twice=0, sum=0;
		
		// enter credit card number
		System.out.println("Please enter your credit card number: ");
		creditCard=scan.nextLine();
		
		// verify credit card number
		for (int i=0; i<creditCard.length(); i++) {		
			String num1 = creditCard.substring(i, i+1);	//Erstellt Substring, soll immer nur GENAU EINE Zahl rausziehen (i, i+1)
			int number = Integer.parseInt(num1);		//Der Substring num1 wird in eine Zahl umgewandelt
			if (i%2==0) {								//Programm beginnt jede Stelle durch 2 zu teilen, wenn 0 rauskommt, beginnt Vorgang in Klammer
				 twice = number*2;						//1. Verdoppeln Sie jede zweite Ziffer der Kartennummer. Starten Sie dabei am Ende der Nummer 	
					if (twice>9){						//2. Ist eine Ziffer durch die Verdopplung zweistellig geworden, subtrahieren Sie 9 
							result = twice-9;
					}else { result = twice;
			}}else{result=number;						//Wenn die Stelle nicht durch 2 zu teilen ist, zählt sie ohne Verdopplung ins result mit rein
		}
			sum+=result; 								//3. Addieren Sie alle Ziffern sum+=result; ist äquivalent zu sum = sum+result;
			}	System.out.println(sum);						
		
		// output the result
		if(sum%10==0){									//4. Ist die Summe ein Vielfaches von 10, ist die Kartennummer korrekt, sonst nicht!
			System.out.println("Your credit card number is correct!");
		}else {
			System.out.println("Error! Your credit card number is not correct!");
		}
	
		//close resources
		scan.close();
	}
}

		
		