package operators;
//			OOP1 Slides3 Grundsätzliches Rechnen mit arithmethischen Operatoren

public class GrundsätzlichesRechnenMitArithmethischenOperatoren {

	public static void main(String[] args) {
		//p.10
		int zahl1 = 45; 
		int zahl2 = 10; 
		int ergebnis = zahl1 * zahl2; 
		System.out.println( "45*10 = "+ ergebnis); 
		
		//p.12 Arithmetische Operatoren - Rechengenauigkeit
		double d1 = 2.0, d2 = 1.1; 
		double d3 = d1 - d2; 
		System.out.println( "2.0-1.1 = " + d3 );
		
		
		//p.16 Arithmetische Operatoren + - * / %
		System.out.println(zahl1+zahl2);
		System.out.println(zahl1-zahl2);
		System.out.println(zahl1*zahl2);
		System.out.println(zahl1/zahl2);
		System.out.println(zahl1%zahl2);
		
	
		/*p.27 Sie haben den Divisionsoperator kennen gelernt. 
		-Was passiert, wenn Sie in einem Javaprogramm eine Integervariable durch Null dividieren? 
		-Was passiert bei einer Fließkommavariablen? */
		System.out.println(d3/0);
		System.out.println(zahl1/0);	
	}
}
