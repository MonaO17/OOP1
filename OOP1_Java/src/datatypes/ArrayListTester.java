package datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] myArr = new Integer[3];
		ArrayList<Integer> myArrList = new ArrayList<Integer>();

		myArr[0]=5;
		myArr[1]=8;
		myArrList.add(5);
		myArrList.add(8);

		System.out.println(Arrays.toString(myArr));
		System.out.println(myArrList);

		myArr[0]=null;
		myArrList.remove(0);

		System.out.println(Arrays.toString(myArr));
		System.out.println(myArrList);

		System.out.println("At Pos 1 (in Array): "+myArr[1]);
		System.out.println("At Pos 0 (inn ArrayList)"+ myArrList.get(0));

		System.out.println("Fakultät von 10: "+fakultaet(10));
	}


	public static long fakultaet(int zahl) {
		if (zahl<2) {
			return 1;
		}else {
			System.out.println("Going into recursion for "+(zahl-1));
			Long result = fakultaet (zahl-1)*zahl;		
			System.out.println("Result for "+ zahl + result);
			return result;
		}
	}
	/**Method to generate a valid sudoku field, 
	 * 		sets i-th number in i-th recursion depth... 
	 * 		up to 9x9 = 81th recursion depth
	 * @param field - the current Sudoku field
	 * @return whether or not it is correct up to now
	 */
	public static boolean sudoku(int[][]field) {
		
		
		return true;
		
	}
}
