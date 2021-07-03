package ifElse;
import java.util.Scanner;

public class WineAdviser {

	public static void main(String[] args) {

		//define variables
		String name;
		String type;
		String flavor;
		Double price;
		Double number1=1.00;

		//gather customer information
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Good Evening! My name is Sam and today I will be your personal sommelieré.");
		System.out.println("What´s your name?");
		name=scan.next();
		name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
		System.out.println("Great! Welcome "+name);		

		/*ask questions regarding wine preferences! For now let´s start with 3 Questions
		 * regarding the type of wine, tart or ripe flavors and price*/

		System.out.println("\nLet´s get started now!!! "
				+ "\nWhich type of wine do you usually prefer? "
				+ "Answer with \"bubbles\"/\"white\"/\"rosé\"/\"red\"");
		type=scan.next();
		System.out.println("Do you usually prefer your "+type+(type.matches("bubbles")? "" : " wine")+" with more tart or ripe flavors? "
				+ "\nPlease answer with \"tart\" or \"ripe\"! If you are not sure please write \"both\"!");
		flavor=scan.next();
		System.out.println("Amazing! One last question: Our wines start from 5,00€ on - About how much money are you willing to spend for the bottle today?");
		price=scan.nextDouble();
		if (price<5) {
			System.out.println("Es tut mir Leid, aber wir haben kein Wein in Ihrem Preissegment vorrätig!");
		} else {
		}
		System.out.println("Thank you! \n");

		//give wine suggestion

		if (type.matches("bubbles") && flavor.matches("tart")) {
			System.out.print(name+", based on your answer I can suggest you our fabulous "+type+" \"Le Côté de la Collin 2011\" with tart flavors of apple "
					+ "\nand lemon from Waiheke Island, New Zealand!");
		} else if (type.matches("bubbles") && flavor.matches("ripe")) { 
			System.out.print(name+", based on your answer I can suggest you our fabulous "+type+" \"Le Côté de la Collin 2012\" with ripe flavors of peaches"
					+ "\nand honey from Waiheke Island, New Zealand!");
		} else if (type.matches("white") && flavor.matches("tart")) {
			System.out.print(name+", based on your answer I can suggest you our fabulous "+type+" \"Le Côté de la Collin 2011\" with tart flavors of apple"
					+ "\nand lemon from Waiheke Island, New Zealand!");
		} else if (type.matches("white") && flavor.matches("ripe")) { 
			System.out.print(name+", based on your answer I can suggest you our fabulous "+type+" \"Le Côté de la Collin 2012\" with ripe flavors of peaches"
					+ "\nand honey from Waiheke Island, New Zealand!");
		} else if (type.matches("rosé")||type.matches("rose") && flavor.matches("tart")) {
			System.out.print(name+", based on your answer I can suggest you our fabulous "+type+" \"Le Côté de la Collin 2011\" with tart flavors of apple "
					+ "\nand strawberries from Waiheke Island, New Zealand!");
		} else if (type.matches("rosé")||type.matches("rose") && flavor.matches("ripe")) { 
			System.out.print(name+", based on your answer I can suggest you our fabulous "+type+" \"Le Côté de la Collin 2012\" with ripe flavors of peaches"
					+ "\nand jackfruit from Waiheke Island, New Zealand!");
		} else if (type.matches("red") && flavor.matches("tart")) {
			System.out.print(name+", based on your answer I can suggest you our fabulous light "+type+" \"Le Côté de la Collin 2011\" with elegant flavors of "
					+ "\nrasperries and vanilla from Waiheke Island, New Zealand!");
		} else if (type.matches("red") && flavor.matches("ripe")) { 
			System.out.print(name+", based on your answer I can suggest you our fabulous bold "+type+" \"Le Côté de la Collin 2012\" with ripe flavors of plums"
					+ "\nand chocolate from Waiheke Island, New Zealand!");
		} else {
			System.out.print(name+", you are not sure about your favorite flavour yet? Why not trying our "+type+" from a very special year? "
					+ "\n2013 was a very special vintage on Waiheke Island with a hot, dry summer! "
					+ "\nTherefore we had less harvest, however the grapes that we had were of an intense quality!");
		}

		System.out.println(" It´s only "+(price+number1)+"€ today!");


		//close resources
		scan.close();
	}
}
