package operators;

import java.text.DecimalFormat;

public class MathPowSqrt {

	public static void main(String[] args) {
		//Math.random
		int[]zahlen=new int[5];
		for(int i=0; i<zahlen.length; i++) {
			zahlen[i]=(int)(Math.random()*30+1);
		}

		//Math.pow (Basis, Exponent)
		System.out.println(Math.pow(2,10));
		
		//Math.sqrt (Quadratwurzel)
		System.out.println(Math.sqrt(9));
		
		//Math.round (rundet auf ganze Zahl)
		System.out.println(Math.round(2.583745));
					
		//		(rundet auf gesetzen Nachkommazahlen)
		DecimalFormat f = new DecimalFormat("#0.00");
		System.out.print(f.format(2.3455)+", ");


	}

}
