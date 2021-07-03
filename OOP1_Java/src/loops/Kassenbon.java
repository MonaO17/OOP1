package loops;
import java.util.Scanner;

public class Kassenbon {

	public static void main(String[] args) {
		//declare variables
		String [] waren= {"Apfel", "Birne", "Bier", "Brot"};
		double [] preis= {0.59, 1.22, 1.40, 3.50};
		double sum=0.0, anzahl=0.0;
		Scanner scan=new Scanner(System.in);
		
		//Abfrage Anzahl
		
		//Einkaufsliste
		for(int i=0; i<waren.length; i++) {
			System.out.println("Wir oft möchten Sie \""+waren[i]+"\" kaufen?");
			anzahl=scan.nextDouble();			
			System.out.println(waren[i]+"\t"+anzahl+" x "+preis[i]+"\tSumme: "+(anzahl*preis[i])+"€");
			sum+=(anzahl*preis[i]);				
		}
		for (int j=0; j<20; j++) {
			System.out.print("_ ");
		}
		System.out.println("\nIhre Rechnung beträgt: "+sum);

		
		scan.close();
	}

}
