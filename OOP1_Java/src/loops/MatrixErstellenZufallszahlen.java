package loops;

public class MatrixErstellenZufallszahlen {

	public static void main(String[] args) {
		//declare two-dimensional int-Array
		int [][] matrix = new int[4][6];

		//matrix gets initialized with random numbers between 1 and 100
		for (int z=0; z<matrix.length; z++) {
			for (int s=0; s<matrix[0].length; s++) {
				matrix[z][s]=(int)(Math.random()*100+1);
			}
		}

		//print out matrix
		for (int i=0; i<matrix.length; i++) {
			for (int j=0;j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}System.out.println();
		}
	}

}
