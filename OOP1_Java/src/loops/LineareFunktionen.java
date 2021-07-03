package loops;

import java.util.Scanner;

public class LineareFunktionen {

	public static void main(String[] args) {
	//declare variables
		Scanner scan=new Scanner(System.in);
		int m=2, n=-5, counter=0;
		int[]funktionswerte=new int[21];

		//Funktionswerte bestimmen
		for (int i=0; i<funktionswerte.length; i++) {
			funktionswerte[i]=m*i+n;
			if(funktionswerte[i]>0) {
				counter++;
			}
		}
		System.out.println(counter);
		for(int f:funktionswerte) {
			System.out.print(f+", ");
		}
		
		//Graph verschieben lassen
		System.out.println("\nWohin soll der Graph an der y-Achse verschoben werden? y-Achsenabschnitt: ");
		n=scan.nextInt();
		counter=0;
		for (int i=0; i<funktionswerte.length; i++) {
			funktionswerte[i]=m*i+n;
			if(funktionswerte[i]>0) {
				counter++;
			}
		}
		System.out.println(counter);
		for(int f:funktionswerte) {
			System.out.print(f+", ");
		}
		
		//Flächenberechnung
		double flaeche=0;
		
		for (int i=0; i<funktionswerte.length; i++) {
			funktionswerte[i]=m*i+n;
			flaeche=Math.pow(i, 2)+Math.pow(n, 2);
			flaeche=Math.sqrt(flaeche);
			System.out.println("Die Fläche zwischen dem Graphen f("+funktionswerte[i]+") und der x-Achse beträgt: "+flaeche);
		}
		
		scan.close();
	}

}
