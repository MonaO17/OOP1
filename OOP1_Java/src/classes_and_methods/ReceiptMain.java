package classes_and_methods;

public class ReceiptMain {
	
	//main
	public static void main(String[] args) {

		Receipt r = new Receipt("HWR Shop");     
		r.add( new ReceiptItem("Steaks", 3, 3.99) );   
		r.add( new ReceiptItem("Milch", 1, 1.39) );   
		r.add( new ReceiptItem("Magnum", 2, 2.99) );   
		r.print();  
		
	}

}
