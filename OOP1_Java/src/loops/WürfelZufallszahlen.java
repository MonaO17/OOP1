package loops;
/*					Aufgabe 4: http://www.javakurs-online.de/Aufgaben.html
 * Schreibe ein Programm welches eine ganzzahlige Zufallszahl zwischen 1 und 6 berechnet. Wird eine 3 gewürfelt, 
 * so soll der Text "Gewonnen, du hast eine 3 gewürfelt." ausgegeben werden. 
 * Bei 4, 5 und 6 wird der Text "Du hast eine [gewürfelte Augen] gewürfelt und darfst es noch einmal versuchen." 
 * ausgegeben. Bei allen anderen Zahlen soll der Text "Leider verloren, du hast eine [gewürfelte Augen] gewürfelt."
 * ausgegeben werden.
 */
import java.util.Scanner;
public class WürfelZufallszahlen {

	public static void main(String[] args) {
		//declare variables
		Scanner scan=new Scanner(System.in);
		String answer;
		int dice =0;
		
		//ask to roll the dice
		do{dice=(int) (Math.random()*6+1);
		System.out.println("Would you like to roll the dice? Please answer with \"yes\" or \"no\"!");
		answer = scan.nextLine();
		answer.equalsIgnoreCase(answer);
			
		//dice loop
		System.out.println(dice);
		if (dice==3) {
				System.out.println("You got a 3!!!! YOU WON!!!! Congratulations :)");
			} else if (dice>3) {
				System.out.println("Too bad :( You lost! You can try again!"); 
			} else {
				System.out.println("Too bad :( You lost!"); 
			} 
		}while(dice>3);
		//close resources
		scan.close();
	}	

}
