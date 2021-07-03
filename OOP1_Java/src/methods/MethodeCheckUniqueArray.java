package methods;

import java.util.Arrays;

public class MethodeCheckUniqueArray {

	public static void main(String[] args) {
		// declare variables
		int [] allNumbers=new int[8];
		for (int i=0; i<8; i++) {
			allNumbers[i]=(int)(Math.random()*100+1);
		}

		//check unique and print
		Arrays.sort(allNumbers);
		for (int number: allNumbers) {
			System.out.println(number);
		}
		System.out.println("Is unique: "+checkUnique(allNumbers));

	}

	public static boolean checkUnique (int []allNumbers) {
		int check=0;

		Arrays.sort(allNumbers);

		for (int number: allNumbers) {
			if(number==check) {
				return false;
			}else {
				check=number;
			}
		}
		return true;
	}

}
