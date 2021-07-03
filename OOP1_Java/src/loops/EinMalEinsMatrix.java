package loops;

import java.util.Scanner;

public class EinMalEinsMatrix {

	public static void main(String[] args) {
		//declare variables
		Scanner scan=new Scanner(System.in);
		int länge=0;

		System.out.println("Geben Sie die länge ein: ");
		länge=scan.nextInt();

		//create headline
		for (int i=1; i<länge; i++) {
			System.out.print("\""+i+"x"+i+"\"\t");
		}
		System.out.println();

		//create matrix
		for (int i=1; i<länge; i++) {
			for (int j=1; j<länge; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println("\""+i+"x"+i+"\"");
		}

		scan.close();
	}

}
