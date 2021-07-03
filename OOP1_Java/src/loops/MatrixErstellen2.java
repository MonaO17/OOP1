package loops;

public class MatrixErstellen2 {

	public static void main(String[] args) {
		// declare variables
		//double[][]a= new double [3][4];					//3 rows, 4 columns
		double [][] a= {
				{0.0, 0.0, 0.0, 0.0},
				{0.0, 0.0, 0.0, 0.0},
				{0.0, 0.0, 0.0, 3.1234}
			};												//3 rows, 4 columns
		
		//loop over (3) rows 
		for(int row=0; row<a.length; row++) {
			//loop over (4) columns
			for (int col=0; col<a[0].length; col++) {
				System.out.printf(" %.2f",a[row][col]);	//zum Runden würde auch gehen: %.3 (für drei Nachkommastellen)
				}
			System.out.println();						//Leeres Sysout ist da, um Matrix die richtige Form zu geben!
														//Sysout ist nach der inneren Schleife!
		}
		

	}

}
