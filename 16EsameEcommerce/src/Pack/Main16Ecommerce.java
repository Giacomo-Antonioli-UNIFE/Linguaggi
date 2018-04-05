package Pack;

import java.io.*;
import java.util.*;

public class Main16Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cliente> Clienti = new LinkedList<Cliente>();
		List<Vednita> Vendite = new LinkedList<Vednita>();
		final String primofile = "clienti.txt", secondofile = "vendite.txt";
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
			System.out.println("Check Primo File");
			// INZIO TRY LETTURA PRIMO FILE
			try {
				String Codice, Tipo, NomeRagione, NCarta, Iva, Dipendenti, IBAN, Indirizzo = null;

				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
					Tokenizer = new StringTokenizer(row);
					Codice = Tokenizer.nextToken();
					Tipo = Tokenizer.nextToken();
					row = inFile.readLine();
					NomeRagione = row;
					row = inFile.readLine();
					if (Tipo.equals("privato")) {

						NCarta = row;
						row = inFile.readLine();
						Indirizzo = row;
						Cliente temp = new Privato(Integer.parseInt(Codice), Tipo, Indirizzo, NomeRagione, NCarta);
						Clienti.add(temp);

					} else {
						Tokenizer = new StringTokenizer(row);
						Iva = Tokenizer.nextToken();
						Dipendenti = Tokenizer.nextToken();
						row = inFile.readLine();
						IBAN = row;
						row = inFile.readLine();
						Indirizzo = row;
						Cliente temp = new Azienda(Integer.parseInt(Codice), Tipo, Indirizzo, NomeRagione, IBAN,
								Integer.parseInt(Iva), Integer.parseInt(Dipendenti));
						Clienti.add(temp);
					}

					row = inFile.readLine();
				}
				// StampaLista
				System.out.println(
						"Tipo,\tID,\tNome e Cognome,\tNumero Carta di Credito,\tRagione Sociale,\tPartita Iva,\tDipendenti,\tIBAN,\tIndirizzo");
				for (Cliente o : Clienti)
					System.out.println(o);

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
				String CodiceVendita, CodiceCliente, Giorno, Mese, Anno, Descrizione, Quantita, Prezzo;

				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) {
					Tokenizer = new StringTokenizer(row);
					CodiceVendita = Tokenizer.nextToken();
					CodiceCliente = Tokenizer.nextToken();
					row = inFile.readLine();
					Tokenizer = new StringTokenizer(row);
					Giorno = Tokenizer.nextToken();
					Mese = Tokenizer.nextToken();
					Anno = Tokenizer.nextToken();
					row = inFile.readLine();
					Descrizione = row;
					row = inFile.readLine();
					Quantita = row;
					row = inFile.readLine();
					Prezzo = row;
					Vednita temp = new Vednita(Integer.parseInt(CodiceVendita), Integer.parseInt(CodiceCliente),
							Integer.parseInt(Giorno), Integer.parseInt(Mese), Integer.parseInt(Anno), Descrizione,
							Integer.parseInt(Quantita), Integer.parseInt(Prezzo));
					Vendite.add(temp);
					row = inFile.readLine();
				}

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}
			System.out.println();
			System.out.println(
					"Codice Vendita,\tCodice Cliente,\tIndirizzo Cliente,\tData,\tDescrizione Prodotto,\tQuantità,\tPrezzo Unitario,\tTotale,\tTotale Iva Esclusa");
			for (Vednita v : Vendite)
				v.Stampa(Clienti);

			// FINE TRY LETTURA SECONDO FILE
			// PUNTO 5
			Punto5(Clienti, Vendite);
			// PUNTO 6
			Punto6(Vendite);
		} catch (FileNotFoundException notfound) {
			System.out.println("Errore. File non trovato");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void Punto5(List<Cliente> Clienti, List<Vednita> Vendite) {
		for (Cliente c : Clienti) {
			int code = c.getID();
			int Tot = 0;
			for (Vednita v : Vendite) {
				if (v.getCodiceCliente() == code) {
					Tot += (v.getQuantita() * v.getPrezzo());
				}
			}
			System.out.println("Il Totale degli acquisti del Cliente con Codice \"" + code + "\" è: " + Tot);
		}
	}
	// numero medio prodotti venduti per vendita+ prezzo medio

	public static void Punto6(List<Vednita> Vendite) {
		for (Vednita v : Vendite) {
			int CVendita = v.getCodiceVendita();
			int TotQ = 0, TotP = 0, Count = 0;
			for (Vednita v2 : Vendite) {
				if (CVendita == v2.getCodiceVendita()) {
					TotQ += v2.getQuantita();
					TotP += v2.getPrezzo();
					Count++;
				}
			}
			System.out.println("Codice Vendita: " + CVendita + "\tQuantità Media:" + (TotQ / Count) + "\tPrezzo Medio:"
					+ (TotP / Count));

		}
	}

}
