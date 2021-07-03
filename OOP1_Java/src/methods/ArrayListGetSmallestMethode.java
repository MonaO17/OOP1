package methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Schreiben Sie ein Programm, in der der User eine Reihe von Zahlen eingeben kann (ArrayList) und ihr
 * eine Methode anschließend die kleinste Zahl zurückgibt
 * • Beispiel: 
 * • Input: 45, 56, 83, 15, 72, 27, 33, 37 
 * • Output: 15 
 */

public class ArrayListGetSmallestMethode {

	public static void main(String[] args) {
		// declare variables
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		int zahl;

		// let user enter numbers
		System.out.println("Bitte geben Sie 10 ganze Zahlen ein: ");
		for (int i=0; i<10; i++) {
			zahl=scan.nextInt();
			numbers.add(zahl);
		}
		
		//return smallest
		System.out.println("Die kleinste eingegebene Zahl lautet: "+smallest(numbers));
		
		//close resources
		scan.close();
	}

	public static int smallest (ArrayList<Integer>numbers) {
		//declare variables
		int smallest=0;
		
		//get smallest number
		Collections.sort(numbers);
		smallest=numbers.get(0);

		return smallest;
	}

}
