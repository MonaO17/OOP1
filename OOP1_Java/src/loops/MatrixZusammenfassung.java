package loops;

public class MatrixZusammenfassung {

	public static void main(String[] args) {
	//Matrix
		for(int i=0; i<3; i++) {		//3 zeilen
			for(int j=0; j<4; j++) {	//4 spalten
				System.out.print("0 ");
			}
			System.out.println();
		}

	//Einheits-Matrix
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(i==j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	//Umgekehrtes Dreieck
		int anzahl=5;
		for(int i=anzahl; i>0; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	//Kai Print Viertelkreis
		int radius=20;
		for(int y=0; y<radius; y++) {
			double x=Math.sqrt(Math.pow(radius, 2)-Math.pow(y, 2));
			for(int j=0; j<x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	//Matrixmultiplikation
		//declare variables
		int summe=0;
		int[][] matrixA= { 
				{7, 2, 1}, 
				{3, 6, 1}, 
				{5, 1, 4}
		};		
		int[][] matrixB= {
				{8, 3, 5},
				{1, 4, 1},
				{1, 3, 4}
		};
		int[][] result= new int[3][3]; //[3 Zeilen in matrixA][3 Spalten in matrixB]

		//multiply matrix
		for (int i=0; i<3; i++) {			//3, da 3 Zeilen in matrixA
			for (int j =0; j<3; j++) {		//3, da 3 Spalten in matrixB
				for(int k=0; k<3; k++) {	//3 = Innenleben der Matrizen
					summe += matrixA[i][k]*matrixB[k][j]; 
				} 
				result[i][j] = summe; 
				summe=0;
			}
		}
		//print result-matrix
		for(int i=0; i<3; i++) {			//3, da result[3][x]
			for(int j=0; j<3; j++) {		//3, da result[x][3]
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}

	//EinMalEins Matrix
		int länge=10;
		
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

	//Matrix mit Zufallszahlen initialisieren
		//declare two-dimensional int-Array
		int [][] matrix = new int[4][6];

		//matrix gets initialized with random numbers between 1 and 100
		for (int z=0; z<matrix.length; z++) {
			for (int s=0; s<matrix[0].length; s++) {
				matrix[z][s]=(int)(Math.random()*100+1);
			}
		}
	}

}
