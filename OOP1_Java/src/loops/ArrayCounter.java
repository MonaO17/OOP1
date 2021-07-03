package loops;

public class ArrayCounter {

	public static void main(String[] args) {
		//declare variables
		int [] array= {0,0,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1,1,1,1};
		int anzahl1=0, anzahl0=0;

		//count 1 & 0
		for (int zahl :array) {
			if (zahl==1) {
				anzahl1++;
			}
		}
		anzahl0=(array.length-anzahl1);

		//return result
		System.out.println("Die Anzahl der Einsen beträgt: "+anzahl1);
		System.out.println("Die Anzahl der Nullen beträgt: "+anzahl0);
	}
}
