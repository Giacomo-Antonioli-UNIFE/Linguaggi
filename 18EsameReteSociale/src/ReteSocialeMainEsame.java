import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class ReteSocialeMainEsame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{

			final String iscritti = "iscritti.txt", secondofile = "segue.txt";
			// Creazione Lista/Mappa
			List<Iscritto> Utenti = new LinkedList<Iscritto>();

			Map<Integer, Iscritto> Relazioni = new HashMap<Integer, Iscritto>();
			// Variabili di Lettura da PrimoFile
			String Type, Address, Account, Password, ID, Nome = null, Cognome = null, RagioneSociale = null;
			// Variabili di Lettura da SecondoFile

			// Variabile di Lettura Linea in File
			String row;
			StringTokenizer Tokenizer;

			// PRIMO
			try {
				// ------------------------------------------
				// Apertura del primo file
				FileReader fr = new FileReader(iscritti); // Questo può generare FileNotFoundException
				BufferedReader inFile = new BufferedReader(fr);
				// ---------------------------------------------

				// INZIO TRY LETTURA PRIMO FILE
				try {
					row = inFile.readLine(); // Questo può generare IOEXception
					while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
						Tokenizer = new StringTokenizer(row);
						Type = Tokenizer.nextToken();
						ID = Tokenizer.nextToken();
						row = inFile.readLine();
						if (Type.equals("individuo")) {
							Tokenizer = new StringTokenizer(row);
							Nome = Tokenizer.nextToken();
							Cognome = Tokenizer.nextToken();
						} else {
							RagioneSociale = row;
						}
						row = inFile.readLine();
						Address = row;
						row = inFile.readLine();
						if (Type.equals("azienda")) {
							Tokenizer = new StringTokenizer(row);
							Nome = Tokenizer.nextToken();
							Cognome = Tokenizer.nextToken();
							row = inFile.readLine();
						}
						Tokenizer = new StringTokenizer(row);
						Account = Tokenizer.nextToken();
						Password = Tokenizer.nextToken();
						row = inFile.readLine();
						row = inFile.readLine();
						if (Type.equals("azienda")) {
							Iscritto temp = new Azienda(Type, Address, Account, Password, Integer.parseInt(ID), Nome,
									Cognome, RagioneSociale);
							Utenti.add(temp);
							Relazioni.put(Integer.parseInt(ID), temp);
						} else {
							Iscritto temp = new Individuo(Type, Address, Account, Password, Integer.parseInt(ID), Nome,
									Cognome);
							Utenti.add(temp);
							Relazioni.put(Integer.parseInt(ID), temp);
						}

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
						String Seguaci;
						ID = row;
						row = inFile.readLine();
						Tokenizer = new StringTokenizer(row);
						Iscritto i = Relazioni.get(Integer.parseInt(ID));
						while (Tokenizer.hasMoreTokens()) {
							Seguaci = Tokenizer.nextToken();

							Iscritto Seguacecorrente = Relazioni.get(Integer.parseInt(Seguaci));
							i.Seguace.add(Seguacecorrente);
						}
						row = inFile.readLine();
					}
					// Connessioni.forEach((key, value) -> System.out.println(key + " : " + value));
					// STAMPA LISTA
					for (Iscritto i : Utenti) {
						System.out.println(i);

					}

				} catch (IOException Readerror) {
					System.out.println(Readerror);
				}

				// FINE TRY LETTURA SECONDO FILE
				// PUNTO 3
				// PUNTO 4
				int max = -1;
				int maxid=0;
				String nome = null;
				for (Iscritto i : Utenti) {
					int tempmax = i.Seguace.size();
					if (tempmax > max) {
						max = tempmax;
						maxid = i.getID();
						nome=i.getNome();
					}

				}
				System.out.println(maxid+" "+nome +" "+max);
				
			} catch (FileNotFoundException notfound) {
				System.out.println("Errore. File non trovato");
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

}
