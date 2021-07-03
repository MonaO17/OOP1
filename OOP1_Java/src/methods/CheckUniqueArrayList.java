package methods;
/*					OOP1 Slides7 p.19 ÜbungcheckUnique()– mit ArrayList
1. Legen Sie eine eindimensionale Integer-ArrayList an und füllen Sie 10 Elemente mit einer Zufallszahl zwischen 
   eins und 100. 
2. Schreiben Sie eine Methode boolean checkUnique( ArrayList<Integer> arrList), die diese ArrayList als Input 
   erhält und prüft, ob alle Zahlen in der ArrayList voneinander verschieden sind. 
   Falls ja, wird true zurück gegeben, sonst false. 
3. Modifizieren Sie Ihre Lösung dahingehend, dass checkUnique() unmittelbar nach jeder erzeugten Zufallszahl 
   aufgerufen wird. Übergeben Sie dabei als zusätzlichen Parameter die zuletzt veränderte Zelle, 
   z. B. boolean checkUnique( ArrayList<Integer>, int pos ) und überprüfen Sie nur, ob die neu eingefügte Zahl 
   von allen anderen verschieden ist. Falls nicht, erzeugen Sie eine Neue.
 */
import java.util.ArrayList;

public class CheckUniqueArrayList {

		public static void main(String[] args) {
			//declare variables
			ArrayList<Integer> al = new ArrayList<Integer>();

			//10 random zahlen generieren
			for (int i = 0; i < 10; i++) {
				al.add((int) (Math.random() *10) +1);
				if (checkUnique(al) ==false) {
					al.remove(i);
					i--;
				}
			}

			//print out
			System.out.print(al.toString());
			System.out.println("unique: " + checkUnique(al));
		}

		public static boolean checkUnique(ArrayList<Integer> arrList) {
			boolean unique = true;

			//checkUnique
			for (int i = 0; i < arrList.size(); i++) {
				for (int j = 0; j < arrList.size(); j++) {
					if (arrList.get(i).equals(arrList.get(j)) && i != j) {
						unique = false;
						break;
					}
				}
			}
			return unique;
		}
	}
