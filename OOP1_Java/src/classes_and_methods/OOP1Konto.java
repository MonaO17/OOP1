package classes_and_methods;

public class OOP1Konto {
	private String kInhaber;
	private int kNummer;
	private double kStand;

	OOP1Konto (String derkInhaber, int diekNummer, double derkStand){
		kInhaber = derkInhaber;
		kNummer = diekNummer;
		kStand = derkStand;
	}

	public void kontodaten () {
		System.out.println("Kontoinhaber*in: "+kInhaber);
		System.out.println("Kontonummer: "+kNummer);
		System.out.println("Kontostand: "+kStand);
	}

	public String toString() {
		String kS=String.valueOf(this.kStand);
		return kS;
	} 
	
	public double getKStand() {
		return this.kStand;
	} 

	public void setKStand(double kStand) {
		this.kStand=kStand;
	}

	public double überweisen (double ü, double betrag) {
		return ü-betrag;
	}

	public double empfangen (double k, double betrag) {
		return k+betrag;
	}
}
