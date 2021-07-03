package loops;
import java.text.DecimalFormat;
/*						OOP1 Slides7 p.5 Übung Zinstabelle
Erstellen Sie eine Tabelle, die für ein Anfangskapital von € 1.000, die Zinsentwicklung über 10 Jahre für die 
Zinssätze 3%, 4%, 5%, 6% und 7% zeigt. Legen Sie für die Zinssätze ein eindimensionales, für die Tabelle ein 
zweidimensionales Array an.
 */
public class Zinstabelle {

	public static void main(String[] args) {
		//declare variables
		DecimalFormat fmt = new DecimalFormat("0.##");
		double money = 1000;
		double [] interest = {1.03, 1.04, 1.05, 1.06, 1.07};
		double [][] table = new double [11][interest.length];
		System.out.print("Jahr\t|\t\t3%\t\t4%\t\t5%\t\t6%\t\t7%");

		//start loop
		for (int i=0; i<=10; i++) {
			System.out.println(" ");
			System.out.print(i+"\t|"+"\t\t");

			for (int j=0; j<interest.length; j++) { 
				if(i==0) {
					table[i][j]=money;
				} else {
					table[i][j]= table[i-1][j]*interest[j];	
				}

				System.out.print(fmt.format(table[i][j])+"\t\t");

			}
		}
	}
}
