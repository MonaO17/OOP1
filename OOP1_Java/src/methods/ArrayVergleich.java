package methods;

public class ArrayVergleich {

	public static void main(String[] args) {
		//declare variables
		String [] array1= {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		String [] array2= {"MySQL", "SQL", "SQLite", "Oracle", "Python", "DB2", "JAVA"};

		for (int i=0; i<array1.length; i++) {
			for (int j=0; j<array2.length; j++) {
				if (array2[j].equals(array1[i])) {
					System.out.println(array2[j]);
				}
			}
		}
	}
}
