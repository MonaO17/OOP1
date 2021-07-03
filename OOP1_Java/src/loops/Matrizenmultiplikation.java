package loops;

public class Matrizenmultiplikation {

	public static void main(String[] args) {
		//declare matrices and variables
		int matrixA [][]= {
				{1,2,3},
				{4,5,6}
		};
		int matrixB [][]= {
				{7,8},
				{9,10},
				{11,12}
		};
		int result [][] = new int [2][2];
		int sum=0;		

		//multiply matrices
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				for (int k=0; k<3; k++) {
					sum= sum+matrixA[i][k]*matrixB[k][j];
				}
				result[i][j]=sum;
				sum=0;
			}
		}

		//give out result
		for(int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(result[i][j]+"\t");	
			}	
			System.out.println("");
		}	
	}		

}
