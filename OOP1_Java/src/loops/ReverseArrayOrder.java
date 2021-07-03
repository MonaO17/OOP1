package loops;

public class ReverseArrayOrder {

	public static void main(String[] args) {
		// declare variables
		int[]zahlen = {1, 2, 3, 4, 5};

		//reverse Array
		int[] b = new int[zahlen.length];
		for (int i = 0; i < zahlen.length; i++) {
			b[zahlen.length-1-i] = zahlen[i];
		}
		
		for(int c:b) {
			System.out.print(c+", ");
		}


	}

}
