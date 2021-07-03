package escape_sequence;
/*				OOP1 Slides3 p.37 Escape Sequences		
Testen Sie jede der unten aufgeführten escape sequences
Escape Sequence \b 		Leerzeichen
				\t 		Tabulator
				\n 		Neue Zeile
				\r		An den Zeilenanfang
				\" 		Doppelte Anführungszeichen
				\' 		Einfache Anführungszeichen
				\\		Ungekehrter Schrägstrich
 */

public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("\t\t\tGuten Tag Leser*in"
				+ "\nWie geht es dir Heute? Antworte bitte mit \"Gut\" oder \"Schlecht\"!"
				+ "\nWie empfindest du das Wetter heute? \rFindest du es auch zu kalt?"
				+ "\n\t\t\t\t\t\tViele Grüße, ich!");
		
		
	}

}
