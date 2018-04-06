import java.io.*;
import java.util.*;

public class Lettura {

	private String row;
	private FileReader fr;
	private BufferedReader inFile;
	private StringTokenizer Tokenizer;
	private File Filetemp;

	private void Status(File FileCorrente) {
		System.out.println("Tentativo di apertura del File: " + FileCorrente);
	}

	private void LetturaFile(File FileCorrente) {
		System.out.println("Lettura del File: " + FileCorrente
				+ "\nSalvataggio dei Dati");
	}

	private void ChiusuraFile(File FileCorrente) {
		System.out.println("Chiusura del File: " + FileCorrente + " in corso");
	}

	public void LetturaPrimoFile(File PrimoFile, List<Ristorante> Ristoranti,
			Map<Integer, String> id_to_name) {
		this.Filetemp = PrimoFile;
		Status(PrimoFile);
		try {
			fr = new FileReader(PrimoFile); // Questo pu� generare
											// FileNotFoundException
			inFile = new BufferedReader(fr);

			try {
				String Codice, Tipo, Nome, Dipendenti, Tavoli, Posti, Superficie, Bagno;
				row = inFile.readLine(); // Questo pu� generare IOEXception
				LetturaFile(PrimoFile);
				while (row != null) { // Conosco la struttura e so che se esiste
										// la prima riga di titolo esisteranno
					Tokenizer = new StringTokenizer(row);
					Codice = Tokenizer.nextToken();
					Tipo = Tokenizer.nextToken();
					row = inFile.readLine();
					Nome = row;
					row = inFile.readLine();
					if (Tipo.equals("pub")) {
						Tokenizer = new StringTokenizer(row);
						Dipendenti = Tokenizer.nextToken();
						Tavoli = Tokenizer.nextToken();
						Ristorante temp = new Pub(Integer.parseInt(Codice),
								Tipo, Nome, Integer.parseInt(Dipendenti),
								Integer.parseInt(Tavoli));
						Ristoranti.add(temp);
					} else {
						Tokenizer = new StringTokenizer(row);
						Posti = Tokenizer.nextToken();
						Superficie = Tokenizer.nextToken();
						Bagno = Tokenizer.nextToken();
						Ristorante temp = new Osteria(Integer.parseInt(Codice),
								Tipo, Nome, Integer.parseInt(Posti),
								Double.parseDouble(Superficie),
								Boolean.parseBoolean(Bagno));
						Ristoranti.add(temp);
					}
					id_to_name.put(Integer.parseInt(Codice), Nome);

					row = inFile.readLine();
				}
				ChiusuraFile(PrimoFile);
				inFile.close();

			} catch (IOException Readerror) {
				System.out.println("Errore di Lettura del File: " + Filetemp);
				System.out.println(Readerror);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: " + Filetemp + " non trovato");
			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void LetturaSecondoFile(File SecondoFile, List<Menu> Carta) {
		this.Filetemp = SecondoFile;
		Status(SecondoFile);
		try {
			fr = new FileReader(SecondoFile); // Questo pu� generare
												// FileNotFoundException
			inFile = new BufferedReader(fr);

			try {
				String CodiceRistorante, Descrizione, Tipo, Prezzo, MateriePrime;
				boolean flag = true;
				row = inFile.readLine(); // Questo pu� generare IOEXception
				LetturaFile(SecondoFile);
				while (row != null) { // Conosco la struttura e so che se esiste
					// la prima riga di titolo esisteranno

					CodiceRistorante = row;
					row = inFile.readLine();
					Descrizione = row;
					row = inFile.readLine();
					Tokenizer = new StringTokenizer(row);
					Tipo = Tokenizer.nextToken();
					Prezzo = Tokenizer.nextToken();
					MateriePrime = Tokenizer.nextToken();

					for (Menu m : Carta) {
						if (m.CodiceRistorante == Integer
								.parseInt(CodiceRistorante)) {

							Prodotti temp = new Prodotti(Tipo, Descrizione,
									Float.parseFloat(Prezzo),
									Float.parseFloat(MateriePrime));
							m.setPiatti(temp);
							flag = false;
						}

					}
					if (flag) {
						Menu temp = new Menu(Integer.parseInt(CodiceRistorante));
						Carta.add(temp);
						Prodotti temprod = new Prodotti(Tipo, Descrizione,
								Float.parseFloat(Prezzo),
								Float.parseFloat(MateriePrime));
						temp.setPiatti(temprod);

					}

					row = inFile.readLine();
					row = inFile.readLine();

				}
				ChiusuraFile(SecondoFile);
				inFile.close();

			} catch (IOException Readerror) {
				System.out.println("Errore di Lettura del File: " + Filetemp);
				System.out.println(Readerror);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: " + Filetemp + " non trovato");
			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
