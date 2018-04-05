import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Mainesame17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String primofile = "scontrini.txt", secondofile = "clienti.txt";
		// Creazione Lista/Mappa
		List<Scontrino> Scontrino = new LinkedList<Scontrino>();
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
			try {int count=1;
				row = inFile.readLine(); // Questo può generare IOEXception
				while (row != null ) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
					String Type, IDscontrino,Day,Month,Year,Name,CodFisc, Iva,CodCli, Address, Description,Quantity,Price;
					System.out.println("Numero di volte entrato nel While Esterno: "+count);
					count++;
					System.out.println(row);
					Tokenizer = new StringTokenizer(row);
					Type=Tokenizer.nextToken();
					IDscontrino= Tokenizer.nextToken();
					row = inFile.readLine();
					Tokenizer = new StringTokenizer(row);
					Day=Tokenizer.nextToken();
					Month=Tokenizer.nextToken();
					Year=Tokenizer.nextToken();
					row = inFile.readLine();
					Name=row;
					row = inFile.readLine();
					if(Type.equals("privato"))
					{
						Address=row;
						row = inFile.readLine();
						Tokenizer = new StringTokenizer(row);
						CodFisc=Tokenizer.nextToken();
						CodCli=Tokenizer.nextToken();
						row = inFile.readLine();
						
						List<Prodotto> Items= new LinkedList<Prodotto>();
						while(row!=null&&!row.isEmpty())
						{
							Description=row;
							
							row = inFile.readLine();
							Tokenizer=new StringTokenizer(row);
							Quantity=Tokenizer.nextToken();
							Price=Tokenizer.nextToken();
							Items.add(new Prodotto(Description,Integer.parseInt(Quantity),Integer.parseInt(Price)));
							row=inFile.readLine();
							
							
						}
						Scontrino.add(new Scontrino(new Privato(Type,Address,Integer.parseInt(CodCli), Name, CodFisc),Integer.parseInt(IDscontrino),Integer.parseInt(Day),Integer.parseInt(Month),Integer.parseInt(Year),Items ));
						
						
					}
					else
					{
						Iva=row;
						row = inFile.readLine();
						CodCli=row;
						row = inFile.readLine();
						Address=row;
						row = inFile.readLine();
						List<Prodotto> Items= new LinkedList<Prodotto>();
						while(row!=null&&!row.isEmpty())
						{
							Description=row;
							
							row = inFile.readLine();
							Tokenizer=new StringTokenizer(row);
							Quantity=Tokenizer.nextToken();
							Price=Tokenizer.nextToken();
							Items.add(new Prodotto(Description,Integer.parseInt(Quantity),Integer.parseInt(Price)));
							row=inFile.readLine();
							
							
						}
						Scontrino.add(new Scontrino(new Azienda(Type, Address, Integer.parseInt(CodCli), Name, Integer.parseInt(Iva)),Integer.parseInt(IDscontrino),Integer.parseInt(Day),Integer.parseInt(Month),Integer.parseInt(Year),Items ));
						
						
					}
					row=inFile.readLine();
			
					
					
					
				}
				// StampaLista
				System.out.println("ID\tData\tNome\tIndirizzo\tCodiceFiscale\tRagioneSociale\tPartitaIva\tCodiceCliente");
				for(Scontrino o : Scontrino) {
					System.out.print(o.getCode()+"\t"+o.getDay()+"-"+o.getMonth()+"-"+o.getYear()+"\t"+o.Buyer.getAddress()+"\t");
					if(o.getBuyer().getType().equals("privato"))
						{
						System.out.print(o.Buyer.getFisc()+"\t-\t-\t"+o.Buyer.getCode()+"\n");
						}
					
					else{
						System.out.print("-\t"+o.Buyer.getName()+"\t"+ o.Buyer.getIva() +"\t"+o.Buyer.getCode()+"\n");
						
					}}

			} catch (IOException Readerror) {
				System.out.println(Readerror);
			}

			// FINE TRY LETTURA ELEMENTI PRIMO FILE

			// ------------------------------------------
		

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
