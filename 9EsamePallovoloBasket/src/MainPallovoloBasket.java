import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;//Posso sintetizzare tutti i precedenti e questo con import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class MainPallovoloBasket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String squadre = "squadre.txt", giocatori = "giocatori.txt";
		// Creazione Lista Squadre
		List<Squadra> Squadre = new LinkedList<Squadra>();

		// Variabili di Lettura da File Squadre
		String Nome, Sport, Partitevinte, Partiteperse, Codice;
		String PunteggioMedio_SetVinti;// Uso questa variabile in quanto i due elementi si trovano nello stesso posto
										// nel file di testo; Discrimino in base allo sport

		// Variabili di Lettura da File Giocaotri
		String CognomeGiocatore, CodiceSquadra, Eta, NumeroMaglia, Ruolo, Titolare;

		// Varibili di controllo apparetenza giocatore ad una squadra
		int code;

		// Variabile di Lettura Linea in File
		String row;
		StringTokenizer Tokenizer;

		// PRIMO
		try {
			// ------------------------------------------
			// Apertura del primo file
			FileReader fr = new FileReader(squadre); // Questo può generare FileNotFoundException
			BufferedReader inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA PRIMO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
										// per struttura del file di testo le due righe successive
					Nome = row; // Conosco la sturttura e so che la prima riga è il nome con eventuali spazi,
								// quindi non applico tokenizer
					row = inFile.readLine(); // Vado a capo per leggere la seconda riga e la leggo
					Tokenizer = new StringTokenizer(row); // So che la secona riga contiene contiele il codice e lo
															// sport separati da uno spazio. Uso tokenizer e sfrutto
															// essattamente due volte il nextToken() per leggere i due
															// dati
					Codice = Tokenizer.nextToken();
					Sport = Tokenizer.nextToken();
					row = inFile.readLine();
					Tokenizer = new StringTokenizer(row);
					Partitevinte = Tokenizer.nextToken();
					Partiteperse = Tokenizer.nextToken();
					PunteggioMedio_SetVinti = Tokenizer.nextToken();
					row = inFile.readLine(); // Faccio un primo readline per saltare la riga vuota
					row = inFile.readLine(); // Faccio un Secondo readline per leggere il nome della possibile squadra
												// successiva per permettere al while di controllarne l'esistenza
												// effettiva

					if (Sport.equals("pallavolo")) {

						Pallavolo squadrapallavolo = new Pallavolo(Integer.parseInt(Partitevinte),
								Integer.parseInt(Partiteperse), Integer.parseInt(Codice), Nome, Sport,
								Float.parseFloat(PunteggioMedio_SetVinti));
						Squadre.add(squadrapallavolo);

					} else if (Sport.equals("basket")) {
						Basket squadrabasket = new Basket(Integer.parseInt(Partitevinte),
								Integer.parseInt(Partiteperse), Integer.parseInt(Codice), Nome, Sport,
								Float.parseFloat(PunteggioMedio_SetVinti));
						Squadre.add(squadrabasket);
					}

				}
				// StampaLista
				System.out.println("Nome\t\tCodice\tVinte\tPerse\tPMedio\tSVinti\tSport");
				for (Squadra a : Squadre)
					System.out.println(a);

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA ELEMENTI PRIMO FILE

			// ------------------------------------------
			// Apertura del secondo file
			fr = new FileReader(giocatori); // Questo può generare FileNotFoundException
			inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA SECONDO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) {
					Tokenizer = new StringTokenizer(row);// So che i dati sono scritti tutti sulla stessa riga separati
															// da spazi quindi faccio subito i token

					CodiceSquadra = Tokenizer.nextToken();
					CognomeGiocatore = Tokenizer.nextToken();
					Eta = Tokenizer.nextToken();
					NumeroMaglia = Tokenizer.nextToken();
					Ruolo = Tokenizer.nextToken();
					Titolare = Tokenizer.nextToken();
					row = inFile.readLine(); // Faccio un readline per leggere il nome del possibile giocatore
												// successiva per permettere al while di controllarne l'esistenza
												// effettiva
					// Scelta in base al codice della squadra di ogni giocatore in che lista
					// inserirlo
					for (Squadra a : Squadre) {
						code = a.getCodice();
						if (code == Integer.parseInt(CodiceSquadra)) {
							a.setMembri(new Giocatore(Integer.parseInt(CodiceSquadra), Integer.parseInt(Eta),
									Integer.parseInt(NumeroMaglia), CognomeGiocatore, Ruolo,
									Boolean.parseBoolean(Titolare)));
						}
					}
				}

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA SECONDO FILE

			// Punto 4

			for (Squadra a : Squadre) {
				// a.Membri.sort(null);
				System.out.println();
				System.out.println(a.getNome());
				a.Stampapunto4();
			}

			// Punto 5

			String Argomento = args[0];
			for (Squadra a : Squadre)
				if (Argomento.equals(a.getNome())) {
					System.out.println("Giocatori della squadra " + args[0]);
					System.out.println(a.Membri);
				}
		} catch (FileNotFoundException notfound) {
			System.out.println("Errore. File non trovato");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
