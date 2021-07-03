package recursion;

import java.util.ArrayList;

public class ArrayListRekursivUndInterativfüllen {

	public static void main(String[] args) {
		// variables
		ArrayList<Integer>zufallsZahlen = new ArrayList<Integer>();
		
		randomNumbers(zufallsZahlen);
		for(int i: zufallsZahlen) {
			System.out.print(i+" ");
		}
	}
	
	public static ArrayList<Integer>randomNumbers (ArrayList <Integer> zufallsZahlen) {
		
		if(zufallsZahlen.size()>=6) {
			return zufallsZahlen;
		}else {
			int r= (int)(Math.random()*100+1);
			zufallsZahlen.add(r);
			return randomNumbers(zufallsZahlen);
		}
		
	}

}
