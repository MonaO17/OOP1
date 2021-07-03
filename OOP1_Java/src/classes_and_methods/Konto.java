package classes_and_methods;

public class Konto {
	private String kInhaber;
	private int kNummer;
	private double kStand;

	public Konto (String kInhaber, int kNummer, double kStand){
		this.kInhaber = kInhaber;
		this.kNummer = kNummer;
		this.kStand = kStand;
	}

	public void kontodaten() {
		System.out.println("Kontoinhaber*in: "+kInhaber);
		System.out.println("Kontonummer: "+kNummer);
		System.out.println("Kontostand: "+kStand);
	}

	public double getKStand() {
		return this.kStand;
	} 

	public void setKStand(double kStand) {
		this.kStand=kStand;
		//set RandomKStand
		this.kStand = (int)(Math.random()*5000+1000); 
	}
	
	public String toString() {
		String kS=String.valueOf(this.kStand);
		return kS;
	} 
	
	public double überweisen (double ü, double betrag) {
		return ü-betrag;
	}


}


