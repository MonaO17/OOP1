package classes_and_methods;

public class Computer {
	String prozessor;
	String grafikkarte;
	int arbeitsspeicher;
	double preis;

	//Konstruktor = sieht aus wie Klasse, aber ohne Schlüsselwörter am Anfang, heißt wie Klasse
	Computer(String derProzessor, String dieGrafikkarte, int derArbeitsspeicher, double derPreis){
		prozessor= derProzessor;
		grafikkarte= dieGrafikkarte;
		arbeitsspeicher= derArbeitsspeicher;
		preis= derPreis;

	}
	
	public void datenblatt () {
		System.out.println("Prozessor: "+prozessor);
		System.out.println("Grafikkarte: "+grafikkarte);
		System.out.println("Arbeitsspeicher: "+arbeitsspeicher);
		System.out.println("Preis: "+preis+" Euro");
	}

}
