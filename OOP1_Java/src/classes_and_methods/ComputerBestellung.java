package classes_and_methods;

public class ComputerBestellung {

	public static void main(String[] args) {
		// Kann man so aufschreiben, wegen Konstruktor
		Computer gamingPC = new Computer ("42GH", "over9000", 1337, 1.200);
		Computer workPC = new Computer ("2MHz", "7er Serie", 10, 900);
		
		//greife zu mit Punkt+Variablenname Beispiele:
		String gk= gamingPC.grafikkarte;
		System.out.println(gk);
		
		double p = workPC.preis;
		System.out.println(p);
		
		//greife auf Methode der Klasse Computer zu:
		gamingPC.datenblatt();
		workPC.datenblatt();
		
		//variablen ändern: +Kontrolle
		gamingPC.prozessor = "8GH";
		gamingPC.datenblatt();
	}
	

}
