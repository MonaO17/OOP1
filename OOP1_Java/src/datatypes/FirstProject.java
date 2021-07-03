package datatypes;
/*						OOP1 Slides2 p.4, p.11 FirstProject
 -Erstellen Sie mit Ihrem Editor ein Programm, das nach Ihrem Namen fragt und Sie begrüßt
  */
import java.util.Scanner;

public class FirstProject {

	public static void main(String[] args) {
		//declare variables
		String name;
		String lastName;
		Scanner scan = new Scanner(System.in);
		
		//ask for name
		System.out.println("Wie heißen Sie mit Vorname?");
		name = scan.nextLine();
		System.out.println("Wie heißen Sie mit Nachname?");
		lastName = scan.nextLine();
		
		//say hello
		System.out.println("Hallo "+name+" "+lastName+"!");
		
		//close resources
		scan.close();
	}

}
