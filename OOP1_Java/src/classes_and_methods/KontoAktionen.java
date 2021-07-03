package classes_and_methods;
import java.util.Scanner;

public class KontoAktionen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String üKonto= null;
		double betrag= 0.0, ü=0.0, sum=0.0;

		// Erzeuge verschiedene Konten:
		Konto no1 = new Konto ("Anna Seeberger", 700800, 3500.97);
		Konto no2 = new Konto ("Hans Block", 400300, 500.55);

		//Gesamten Kontodaten ausgeben lassen
		no1.kontodaten();
		no2.kontodaten();

		//set & get Kontostand 
		no2.setKStand(700.50);
		System.out.println(no2.getKStand());
		
		//Kontostand als String
		System.out.println(no1.toString());
		
		//Summe Kapital der Bank
		sum=no1.getKStand()+no2.getKStand();
		System.out.println(sum);

		//Überweisung
		System.out.println("Welchen Betrag wollen Sie überweisen?");
		betrag = scan.nextDouble(); scan.nextLine();
		System.out.println("Von welchem Konto wollen Sie überweisen?");
		üKonto = scan.nextLine();
		if (üKonto.equals("no1")) {
			ü= Double.valueOf(no1.getKStand()); 
			no1.setKStand(no1.überweisen(ü,betrag));
		}else if (üKonto.equals("no2")) {
			ü= Double.valueOf(no2.getKStand()); 
			no2.setKStand(no2.überweisen(ü,betrag));
		}

		//close resources
		scan.close();

	}

}
