package loops;

public class GeometrieSternchen {

	public static void main(String[] args) {
		int länge=20, höhe=13;
		//call methods
		quadrat(länge, höhe);
		dreieck(länge);
		dreieckUmgekehrt(länge);
		viertelkreis(länge);

	}
	public static void quadrat(int länge, int höhe) {
		for(int i=0; i<höhe; i++) {
			for (int j=0; j<länge;j++){
				if(i==0||i==höhe-1||j==0||j==länge-1) {
					System.out.print("*");
				}else {System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void dreieck(int länge) {
		for (int i=0; i<länge; i++) {
			  for (int j=0; j<i ; j++) {
			    System.out.print("*");  
			  }
			 System.out.println("");
			}
	}

	public static void dreieckUmgekehrt(int länge) {
		for (int i=länge; i>0; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void viertelkreis (int länge) {
		for (int i=0; i<länge; i++) {
			double x=Math.sqrt(Math.pow(länge, 2)-Math.pow(i, 2));
			for (int j=0; j<x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}