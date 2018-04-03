import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class MainTipico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final String primofile = "filiali.txt", secondofile = "clienti.txt";
		// Creazione Lista/Mappa

		// Variabili di Lettura da File Filiali

		// Variabili di Lettura da File Clienti

		// Variabile di Lettura Linea in File
		String row;
		StringTokenizer Tokenizer;

		// PRIMO
		try {
			// ------------------------------------------
			// Apertura del primo file
			FileReader fr = new FileReader(primofile); // Questo può generare FileNotFoundException
			BufferedReader inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA PRIMO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
					row = inFile.readLine();
				}
				// StampaLista

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA ELEMENTI PRIMO FILE

			// ------------------------------------------
			// Apertura del secondo file
			fr = new FileReader(secondofile); // Questo può generare FileNotFoundException
			inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA SECONDO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) {

					row = inFile.readLine();

				}

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA SECONDO FILE
			// PUNTO 3
			// PUNTO 4

		} catch (FileNotFoundException notfound) {
			System.out.println("Errore. File non trovato");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
