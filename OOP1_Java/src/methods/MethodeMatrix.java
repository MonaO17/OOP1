package methods;
/* * Aufgabe 5) 
 * a) Schreiben Sie eine Methode, die eine n*n-Matrix 
 * (alles Nullen ausgibt. n ist die Anzahl der Zeilen und Spalten und soll als Parameter übergeben werden. 
 * Beispiel: n=3 	0 0 0 
 * 					0 0 0 
 * 					0 0 0 
 * 
 * b) Die Matrix aus a) soll als Einheitsmatrix sein. 
 * https://de.wikipedia.org/wiki/Einheitsmatrix Beispiel: 
 * 			n=3 	1 0 0 
 * 					0 1 0 
 * 					0 0 1 
 */

import java.util.Scanner;

public class MethodeMatrix {

	public static void main(String[] args) {
		// declare variables
		Scanner scan= new Scanner(System.in);
		int n = 0;

		System.out.println("Geben Sie eine beliebige ganze Zahl ein: ");
		n= scan.nextInt();
		matrix(n);
		System.out.println("\n");
		einheitsMatrix(n);

	}
	public static void matrix(int n) {
		//create matrix with 2 for-loops
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("0\t");
			}
			System.out.println();
		}
	}

	public static void einheitsMatrix(int n) {
		//declare variables
		int count=0;

		//create matrix with 2 for-loops
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (j==count && i==count) {
					System.out.print(1+"\t");
					count++;
				}else {
					System.out.print(0+"\t");
				}
			}System.out.println();
		}
	}
}
