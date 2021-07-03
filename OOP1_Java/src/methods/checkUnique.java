package methods;

import java.util.Arrays;

public class checkUnique {

	public static void main(String[] args) {
		//declare variables
		int [] array = new int [6];
		
		//initialisieren mit Zufallszahlen
		do {
			for(int i=0; i<array.length; i++) {
				array [i]= (int)(Math.random()*10+1);
			}
		}while(!checkUni(array));
		
		for (int erg: array) {
			System.out.print(erg+", ");
		}

	}

	public static boolean checkUni(int [] array) {
		boolean checkUnique=true;
		int check=0;
		
		Arrays.sort(array);
		
		for(int num:array) {
			if(num==check) {
				checkUnique = false;
			}else {
				check=num;
			}
		}
		return checkUnique;
	}
}
