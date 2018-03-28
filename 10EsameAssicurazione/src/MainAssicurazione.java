import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class MainAssicurazione {
	public static void main(String[] args) {

		final String filiali = "filiali.txt", clienti = "clienti.txt";
		// Creazione Lista Squadre
		List<Filiali> Filiali = new LinkedList<Filiali>();
		List<Cliente> ListaClienti = new LinkedList<Cliente>();

		// Variabili di Lettura da File Filiali
		String NomeFiliale, CodiceFiliale, Indirizzo;

		// Variabili di Lettura da File Clienti
		String Tipo, CodiceCliente, Nome, Cognome, CodiceFilialeAttuale, RagioneSociale, CodiciPassati, Premio,
				Premiopiutasse;

		// Varibili di controllo apparetenza giocatore ad una squadra
		int count,count2;
		// Variabile di Lettura Linea in File
		String row;
		StringTokenizer Tokenizer;

		// PRIMO
		try {
			// ------------------------------------------
			// Apertura del primo file
			FileReader fr = new FileReader(filiali); // Questo può generare FileNotFoundException
			BufferedReader inFile = new BufferedReader(fr);
			// ---------------------------------------------

			// INZIO TRY LETTURA PRIMO FILE
			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
					NomeFiliale = row;
					System.out.println(row);
					CodiceFiliale = row = inFile.readLine();
					System.out.println(row);
					Indirizzo = row = inFile.readLine();
					System.out.println(row);
					row = inFile.readLine();
					row = inFile.readLine();
					Filiali.add(new Filiali(NomeFiliale, Integer.parseInt(CodiceFiliale), Indirizzo));
				}
				// StampaLista

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
					Tokenizer = new StringTokenizer(row);// So che i dati sono scritti tutti sulla stessa riga separati
					Tipo = Tokenizer.nextToken();// da spazi quindi faccio subito i token
					CodiceCliente = Tokenizer.nextToken();
					if (Tipo.equals("privato")) {

						row = inFile.readLine();
						Tokenizer = new StringTokenizer(row);
						Nome = Tokenizer.nextToken();

						Cognome = Tokenizer.nextToken();
						row = inFile.readLine();
						CodiceFilialeAttuale = row;
						row = inFile.readLine();
						Tokenizer = new StringTokenizer(row);
						List<Integer> Filialipassate = new LinkedList<Integer>();
						while (Tokenizer.hasMoreTokens()) {
							Filialipassate.add(Integer.parseInt(Tokenizer.nextToken()));
						}
						row = inFile.readLine();
						Premio = row;
						row = inFile.readLine();
						row = inFile.readLine();
						ListaClienti.add(new Privato(Tipo, Integer.parseInt(CodiceCliente),
								Integer.parseInt(CodiceFilialeAttuale), Float.parseFloat(Premio), Filialipassate, Nome,
								Cognome));

					} else {
						row = inFile.readLine();
						RagioneSociale = row;
						row = inFile.readLine();
						CodiceFilialeAttuale = row;
						row = inFile.readLine();
						Tokenizer = new StringTokenizer(row);
						List<Integer> Filialipassate = new LinkedList<Integer>();
						while (Tokenizer.hasMoreTokens()) {
							Filialipassate.add(Integer.parseInt(Tokenizer.nextToken()));
						}
						row = inFile.readLine();
						Premio = row;
						row = inFile.readLine();
						Premiopiutasse = row;
						ListaClienti.add(new Azienda(Tipo, Integer.parseInt(CodiceCliente),
								Integer.parseInt(CodiceFilialeAttuale), Float.parseFloat(Premio), Filialipassate,
								RagioneSociale, Float.parseFloat(Premiopiutasse)));

						row = inFile.readLine();
						row = inFile.readLine();

					}

				}

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA SECONDO FILE
			//PUNTO 3
			for(Cliente a: ListaClienti)
				System.out.println(a);

			//PUNTO 4
			for(Filiali a : Filiali)
			{count=count2=0;
			System.out.println("Filiale: "+a.getNome());
				for(Cliente  b : ListaClienti)
				{	
					if(a.getCodice()==b.getCodiceFiliale())
					{count++;}
						
					if(b.Search(a.getCodice()))
					{
						count2++;
					}
						
					
				}
				count2+=count;
			System.out.println("Il numero dei clienti attuali della filiale è: "+count);
			System.out.println("Il nuemro di tutti i clienti avuti dalla filiale è: "+count2);
			}
			
			
			
			
			
		} catch (FileNotFoundException notfound) {
			System.out.println("Errore. File non trovato");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
