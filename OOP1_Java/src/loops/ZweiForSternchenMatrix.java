package loops;

import java.util.Scanner;

public class ZweiForSternchenMatrix{
	
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=0;
		
		System.out.println("Geben Sie das n der n*n Matrix ein: ");
		number= scan.nextInt();
		
		for(int i=0; i<number; i++) {
			for (int j=0; j<number; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scan.close();
		
	}
	
}