package read_write_documents;
/*/*				OOP1 Slides9 p.13 Schreiben und Lesen
 * 1. Legen Sie eine Textdatei an mit einem Satz pro Zeile. Schreiben Sie ein Programm das die Textdatei Zeile für 
 *    Zeile lädt und die Leerzeichen durch Unterstriche ersetzt in eine neue Datei schreibt. 
 * 2. Ändern Sie Ihr Programm so, dass Sie den Dateinamen eingeben können und die Datei mit den geänderten Daten 
 *    bekommt den um „_changed“ erweiterten Dateinamen. 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicsDokumente {

	public static void main(String[] args){
	//READ TEXT DOCUMENT
		//declare variables
		Scanner fileScan = null;

		//create Scanner-Objekt und File-Objekt
		try{
			fileScan = new Scanner(new File("C:\\OOP1\\TextFile.txt"));
		}catch (FileNotFoundException e) {
			System.out.println("File could not be found!");
		}

		//read text from file
		while (fileScan.hasNextLine()) {		//Solange das File eine nächste Zeile hat....
			fileScan.useDelimiter("/");			// / wird eliminiert
			String line=fileScan.nextLine();	//line wird mit Zeile initialisiert
			
			System.out.println(line);
		}

		//close resources
		fileScan.close();


	//CREATE & WRITE IN TEXT DOCUMENT
		//declare variables
		String fileName="NewTextFile.txt", text;
		Scanner scan = new Scanner(System.in);
		PrintWriter writer=null;	
		FileWriter addSomething=null;
		

		//create text document
		try {
			addSomething= new FileWriter(fileName, true);
			writer= new PrintWriter (addSomething);	
		} catch (IOException e) {
			System.err.println("Sorry! There has been a mistake!");
		}
		
		//write in file
		System.out.println("Please type in your text: ");
		text=scan.nextLine();
		writer.println(text);
		
		//close resources
		writer.close();
		scan.close();
	}
}


