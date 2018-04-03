import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class MainAcquedotto {

	public static void main(String[] args) {

		final String letture = "letture.txt", clienti = "clienti.txt";
		// Creazione Lista Clienti
		List<Cliente> ListaClienti = new LinkedList<Cliente>();

		// Variabili di Lettura da File Filiali
		String Tipo, ID, Contratto, Indirizzo, Nome = null, Cognome = null, Portata, RagioneSociale = null,
				PortataMassima = null;

		// Variabili di Lettura da File Clienti

		/*
		 * String CodiceCliente, Nome, Cognome, CodiceFilialeAttuale, RagioneSociale,
		 * CodiciPassati, Premio, Premiopiutasse;
		 */
		// Varibili di controllo apparetenza giocatore ad una squadra

		// Variabile di Lettura Linea in File
		String row;
		StringTokenizer Tokenizer;

		// PRIMO
		try {
			// ------------------------------------------
			// Apertura del primo file
			FileReader fr = new FileReader(clienti); // Questo può generare FileNotFoundException
			BufferedReader inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA PRIMO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
					Tokenizer = new StringTokenizer(row);
					Tipo = Tokenizer.nextToken();
					ID = Tokenizer.nextToken();

					row = inFile.readLine();

					if (Tipo.equals("residenziale")) {
						Tokenizer = new StringTokenizer(row);
						Nome = Tokenizer.nextToken();
						Cognome = Tokenizer.nextToken();
					} else {
						RagioneSociale = row;
						row = inFile.readLine();
						PortataMassima = row;

					}

					row = inFile.readLine();
					Contratto = row;

					row = inFile.readLine();
					Indirizzo = row;

					row = inFile.readLine();
					row = inFile.readLine();

					if (Tipo.equals("residenziale")) {
						ListaClienti
								.add(new Residente(Tipo, Contratto, Indirizzo, Integer.parseInt(ID), Nome, Cognome));
					} else {
						ListaClienti.add(new Azienda(Tipo, Contratto, Indirizzo, Integer.parseInt(ID), RagioneSociale,
								Double.parseDouble(PortataMassima)));
					}
				}
				inFile.close();
				// StampaLista Silver Diamond Connection
				Collections.sort(ListaClienti, new Orderer());
				System.out.println("ID\tTipo\tNome/Cognome\tRagioneSociale\tIndirizzo\tTipoContratto\tPortataMassima");
				for (Cliente a : ListaClienti) {
					System.out.println(a);
				}

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA ELEMENTI PRIMO FILE

			// ------------------------------------------
			// Apertura del secondo file
			fr = new FileReader(clienti); // Questo può generare FileNotFoundException
			inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA SECONDO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) {
					row = inFile.readLine();
				}
				inFile.close();

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

		} catch (FileNotFoundException notfound) {
			System.out.println("Errore. File non trovato");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
