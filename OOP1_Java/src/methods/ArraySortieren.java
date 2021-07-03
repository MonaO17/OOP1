package methods;

public class ArraySortieren {

	public static void main(String[] args) {
		// variables
		int[] zusortieren= {34,62,1,2,56,7,97,53,2,5,7,87,43};
		int z=0;

		//sortieren
		for(int i=1; i<zusortieren.length; i++) {
			for(int j=0; j<zusortieren.length-i; j++) {
				if(zusortieren[j]>zusortieren[j+1]) {
					z=zusortieren[j];
					zusortieren[j]=zusortieren[j+1];
					zusortieren[j+1]=z;
				}
			}
		}

		//ausgeben
		for (int al:zusortieren) {
			System.out.print(al+", ");
		}

	}

}
