package Pack;

import java.io.*;
import java.util.*;

public class MainEsame16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String primofile = "negozi.txt", secondofile = "scontrini.txt";
		// Creazione Lista/Mappa
		List<Negozio> Franchise = new LinkedList<Negozio>();
		List<Scontrino> Scontrini = new LinkedList<Scontrino>();
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
				String Tipo, Codice, Indirizzo, NomeRagione, CodiceFiscale, Iva, Casse, Superficie;
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
					Tokenizer = new StringTokenizer(row);
					Tipo = Tokenizer.nextToken();
					Codice = Tokenizer.nextToken();
					row = inFile.readLine();
					Indirizzo = row;
					row = inFile.readLine();
					NomeRagione = row;
					row = inFile.readLine();
					switch (Tipo.toLowerCase()) {
					case "city-store":
						CodiceFiscale = row;
						row = inFile.readLine();
						Superficie = row;
						Negozio temp = new CityStore(Integer.parseInt(Codice), Integer.parseInt(Superficie), Tipo,
								Indirizzo, NomeRagione, CodiceFiscale);
						Franchise.add(temp);
						break;
					case "super-store":
						Tokenizer = new StringTokenizer(row);
						Iva = Tokenizer.nextToken();
						Casse = Tokenizer.nextToken();
						row = inFile.readLine();
						Superficie = row;
						Negozio tempo = new SuperStore(Integer.parseInt(Codice), Integer.parseInt(Superficie), Tipo,
								Indirizzo, NomeRagione, Integer.parseInt(Iva), Integer.parseInt(Casse));
						Franchise.add(tempo);
						break;

					}

					row = inFile.readLine();
				}
				// StampaLista
				inFile.close();
				for (Negozio n : Franchise) {
					System.out.println(n);
				}

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
				String CodScontrino, Codnegozio, Giorno, Mese, Anno, Descrizione, Prezzo, Quantita;
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) {
					Tokenizer = new StringTokenizer(row);
					CodScontrino = Tokenizer.nextToken();
					Codnegozio = Tokenizer.nextToken();
					row = inFile.readLine();
					Tokenizer = new StringTokenizer(row);
					Giorno = Tokenizer.nextToken();
					Mese = Tokenizer.nextToken();
					Anno = Tokenizer.nextToken();
					Scontrino temp = new Scontrino(Integer.parseInt(CodScontrino), Integer.parseInt(Codnegozio),
							Integer.parseInt(Giorno), Integer.parseInt(Mese), Integer.parseInt(Anno));
					Scontrini.add(temp);
					row = inFile.readLine();
					while (row != null && !row.isEmpty()) {
						Descrizione = row;
						row = inFile.readLine();
						Tokenizer = new StringTokenizer(row);
						Quantita = Tokenizer.nextToken();
						Prezzo = Tokenizer.nextToken();
						row = inFile.readLine();
						Prodotto tempprod = new Prodotto(Descrizione, Integer.parseInt(Quantita),
								Integer.parseInt(Prezzo));
						temp.setProdotti(tempprod);

					}

					row = inFile.readLine();

				}

				inFile.close();

				for (Scontrino s : Scontrini) {
					System.out.println(s);
				}
			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA SECONDO FILE
			// PUNTO 4
			Punto4(Franchise, Scontrini);
			// PUNTO 5
			Punto5(Franchise, Scontrini);
		} catch (FileNotFoundException notfound) {
			System.out.println("Errore. File non trovato");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void Punto4(List<Negozio> Negozi, List<Scontrino> Scontrini) {
		int Codneg;
		for (Negozio n : Negozi) {
			Codneg = n.getID();

			for (Scontrino s : Scontrini) {
				if (Codneg == s.getCodiceNegozio()) {
					s.Punto4();
				}
			}

		}
	}

	public static void Punto5(List<Negozio> Negozi, List<Scontrino> Scontrini) {
		// per ogni codice negozio stampa codice neg + fatturato su metro quadro
		// totscontrini del negozio/superficie

		int Codneg;
		int totsum = 0;
		for (Negozio n : Negozi) {
			Codneg = n.getID();
			for (Scontrino s : Scontrini) {
				if (Codneg == s.getCodiceNegozio()) {
					totsum += s.Punto5();
				}
			}
				System.out.println(Codneg + " Fatturato per metro quadro" + (double) totsum / n.getSuperfice());
				totsum = 0;
			
		}

	}

}
