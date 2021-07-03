package loops;
import java.util.Arrays;
public class Matrixmulitplikation {

	public static void main(String[] args) {
		// declare variables
		// c[i][j]=a[i][0]*b[j][0]+a[i][1]*b[j][1]+a[i][2]*b[j][2];
		// int[][] b= new int[3][3];
		int zeile=0, spalte=0, ergebnis=0;
		int[][] a= { 
				{7, 2, 1}, 
				{3, 6, 1}, 
				{5, 1, 4}
		};		
		int[][] b= {
				{8, 3, 5},
				{1, 4, 1},
				{1, 3, 4}
		};
		int[][] c= new int[3][3];						 //Erste Zahl [3] für Zeilen in Matrix a, Zweite Zahl [3] für Spalten in Matrix b

		//create matrix
		for (int i=0; i<3; i++) {						//<3, weil drei Zeilen in Matrix a
			for (int j =0; j<3; j++) {					//<3, weil drei Spalten in Matrix b
				for(int k=0; k<3; k++) {				//<3, weil drei Spalten in Matrix a (oder auch = Innenleben der Matrizen)
					spalte = a[i][k];					
					zeile = b[k][j];					//c[i][j]+=a[i][k]*b[k][j];
					ergebnis += (zeile*spalte);
					c[i][j] = ergebnis;
				}
				ergebnis=0;
			}
		}
		System.out.println(Arrays.deepToString(c));

	}
}
