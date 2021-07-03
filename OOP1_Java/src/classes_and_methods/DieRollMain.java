package classes_and_methods;
//import Die;

public class DieRollMain {

	public static void main(String[] args) {
		//Declare variables
		Die die1, die2; 
		int sum;

		//Creates two Die objects and rolls them several times.
		die1 = new Die(); 
		die2 = new Die();

		die1.roll(); 
		die2.roll(); 
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);

		die1.roll(); 
		die2.setFaceValue(4); 
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);

		sum = die1.getFaceValue() + die2.getFaceValue(); 
		System.out.println("Sum: " + sum);

		sum = die1.roll()+die2.roll(); 
		System.out.println("Die One: " + die1 + ", Die Two: " + die2); 
		System.out.println("New sum: " + sum);

	}

}
