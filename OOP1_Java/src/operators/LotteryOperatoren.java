package operators;
/*						OOP1 Slides3 p.27	Operatoren
  Experimentieren Sie mit den numerischen, relationalen, boolschen, und mit dem speziellen dreiwertigen 
  JavaOperator(en). Verwenden Sie jeden Operator mindestens ein mal.
  Relationalen Operatoren: 	== für Test auf Gleichheit z. B. boolean truth = v1 == v2; 
  						 	< für kleiner und <= für kleiner oder gleich 
  						 	> für größer und >= für größer oder gleich 
  						 	!= für ungleich
  Boolschen Operatoren:		! für die Negation 
  							&& für logisches Und 
  							|| für logisches Oder
  Spezieller Dreiwertiger 	Falls die Bedingung wahr ist, ist der erste Ausdruck das Ergebnis, sonst der zweite: 
  Operator:					Bedingung ? Ausdruck1 : Ausdruck2
 */

import java.util.Scanner;

public class LotteryOperatoren {

	public static void main(String[] args) {					
		//Define variables
		int zahl10=0;
		int zahl11=0;
		int result = zahl10+zahl11;
		String answer;
		Scanner scan = new Scanner(System.in);	

		//Anleitung Spiel
		System.out.println("\t\t\tLassen Sie uns ein Spiel spielen! \nIch werde Sie "
				+ "gleich auffordern zwei Zahlen einzugeben, die dann addiert werden! "
				+ "\n\tWenn das Ergebnis die gesuchte Zahl ist, haben Sie gewonnen!"
				+ "\n\t\t\tREADY? \t ...SET...\tGO!");

		do {									//open loop
			System.out.println("\nGeben Sie eine ganze Zahl zwischen 1 und 10 ein!");
			zahl10= scan.nextInt();
			if (zahl10>0 && zahl10<11) {
			} else { System.out.println("Ihre Zahl ist ungültig, Sie haben verloren!");
			}

			System.out.println("Geben Sie eine ganze Zahl zwischen 10 und 20 ein!");
			zahl11=scan.nextInt();
			if (zahl11>11 && zahl11<21) {
				result = zahl10+zahl11;
			} else {System.out.println("Ihre Zahl ist ungültig, Sie haben verloren!");
			}

			System.out.println("Addiert ergeben Ihre Zahlen: " + result);

			if (result == 17) {	
				System.out.println("Herzlichen Glückwunsch!!! Sie haben gewonnen!!!!");
			} else {System.out.println("Schade, dass ist leider nicht die gesuchte Zahl!");
			}

			//Dreiwertiger Java Operator
			if (result ==17) {
			} else {
				System.out.println((result > 17)? "\n\t\tDas Ergebnis ist eine kleinere Zahl ;)" : "\n\t\tDas Ergebnis ist eine größere Zahl ;)");
			}

			// Neuer Versuch?
			System.out.println("\nMöchten Sie es nochmal probieren? \"Ja\" (1) \"Nein\" (2)");
			int ans =scan.nextInt();
			answer = String.valueOf(ans);

		}while (answer.equals("1"));				//close loop

		//Close resources
		scan.close();
	}
}
