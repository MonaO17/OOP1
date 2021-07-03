package classes_and_methods;
import java.util.Scanner;

public class OOP1KontoAusführen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String üKonto= null, eKonto=null;
		double betrag= 0.0;

		// Erzeuge verschiedene Konten:
		OOP1Konto no1 = new OOP1Konto ("Anna Seeberger", 700800, 3500.97);
		OOP1Konto no2 = new OOP1Konto ("Hans Block", 400300, 500.55);
		OOP1Konto no3 = new OOP1Konto ("Sam Samson", 200600, 1234.56);

		//Kontodaten ausgeben lassen
		no1.kontodaten();
		no2.kontodaten();
		System.out.println(no1.toString());
		no3.kontodaten();


		//Überweisung
		double ü=0.0, k=0.0;

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
		}else if (üKonto.equals("no3")) {
			ü= Double.valueOf(no3.getKStand()); 
			no3.setKStand(no3.überweisen(ü,betrag));
		}


		System.out.println("Auf welches Konto wollen Sie überweisen?");
		eKonto= scan.nextLine();
		if (eKonto.equals("no1")) {
			k= Double.valueOf(no1.getKStand()); 
			no1.setKStand(no1.empfangen(k,betrag));
		}else if(eKonto.equals("no2")) {
			k= Double.valueOf(no2.getKStand()); 
			no2.setKStand(no2.empfangen(k,betrag));
		}else if(eKonto.equals("no3")) {
			k= Double.valueOf(no3.getKStand()); 
			no3.setKStand(no3.empfangen(k,betrag));
		}


		//Neuen Kontodaten ausgeben lassen
		no1.kontodaten();
		no2.kontodaten();
		no3.kontodaten();

		//close resources
		scan.close();
	}

}
