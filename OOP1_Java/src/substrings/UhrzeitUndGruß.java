package substrings;

/* 						OOP1 Slides4 p.11,14 Uhrzeit und Gruß
 *1.	Erstellen Sie eine Anwendung, die den Anwender nach der aktuellen Uhrzeit fragt (nur volle Stunde). 
 *Ist es vormittags, soll "Guten Morgen" ausgeben werden, nachmittags erscheint "Guten Tag" und nach 18 Uhr 
 *"Guten Abend". Falls die Eingabe keine gültige Uhrzeit darstellt, soll eine entsprechende Fehlermeldung 
 *erscheinen. 
 *(Hinweis: Die Eingabe-Zeichenkette lässt sich mit Integer.parseInt(<String>) in eine ganze Zahl umwandeln)
 *
 *2.	Erweitern Sie Ihre Anwendung so, dass auch eine minutengenaue Eingabe verarbeitet wird. 
 *Von 00:00 bis 11:30 wird "Guten Morgen", von 11:31 bis 17:45 "Guten Tag" und ab 17:46 "Guten Abend" ausgegeben. 
 *(Hinweis: Die Zeitbestandteile Stunden und Minuten lassen sich mit Hilfe der String-Methode substring() 
 *extrahieren, die Überprüfung des Doppelpunktes mit charAt(). Lesen Sie die Online-Hilfe zu diesen Methoden!)
 */

import java.time.LocalTime;
import java.util.Scanner;

public class UhrzeitUndGruß {

	public static void main(String[] args) {
		//1.  Uhrzeit und Gruß volle Stunde
		//declare variables
		int timeCustomer = 0;
		Scanner scan = new Scanner(System.in);

		//take time
		System.out.println("Wie spät ist es gerade bei Ihnen? Bitte geben Sie eine volle Stunde an: ");
		try {
			timeCustomer = scan.nextInt();
			scan.nextLine();
		}catch(Exception e) {
			System.out.println("Die Eingabe hatte ein falsches Format!");
		}

		//greet
		if (timeCustomer<=11) {
			System.out.println("Guten Morgen!");			
		}else if (timeCustomer>11 && timeCustomer<17) {
			System.out.println("Guten Tag!");
		}else if (timeCustomer>17 && timeCustomer<=24) {
			System.out.println("Guten Abend!");
		}

		//2.	Uhrzeit und Gruß mit substring
		//declare variables
		String newTime="Uhrzeit";

		//take time
		System.out.println("Wie spät ist es gerade bei Ihnen? Bitte geben Sie Ihre Antwort im Format hh:mm an: ");
		try { 	
			newTime = scan.nextLine();
			String sub1 = newTime.substring(0,1+1);	//Vom String NewTime werden die ersten zwei Ziffern gelesen
			String sub2 = newTime.substring(3,4+1);	//Vom String NewTime werden die Ziffern 3 und 4 gelesen
			int hh= Integer.parseInt(sub1);			//Der Substring sub1 wird in eine ganze Zahl umgewandelt
			int mm= Integer.parseInt(sub2);			//Der Substring sub2 wird in eine ganze Zahl umgewandelt
			if (hh<11 || hh==11 && mm<=30) { 
				System.out.println("Guten Morgen!");	
			} else if (hh<17 || hh==17 && mm<=45) { 
				System.out.println("Guten Tag!");	
			} else if (hh<24) { 
				System.out.println("Guten Abend!");	
			}
		}catch (Exception e) {
			System.out.println("Das Format "+newTime+" ist nicht bekannt!");
		}

		//close resources
		scan.close();

		//FunFact LocalTime
		LocalTime Time= LocalTime.now();
		System.out.println("It´s " + Time + " in Berlin, Germany.");

	}
}
