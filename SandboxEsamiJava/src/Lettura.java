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
		System.out.println("Lettura del File: " + FileCorrente + "\nSalvataggio dei Dati");
	}

	private void ChiusuraFile(File FileCorrente) {
		System.out.println("Chiusura del File: " + FileCorrente + " in corso");
	}

	public void LetturaPrimoFile(File PrimoFile) {
		this.Filetemp = PrimoFile;
		Status(PrimoFile);
		try {
			fr = new FileReader(PrimoFile); // Questo può generare FileNotFoundException
			inFile = new BufferedReader(fr);

			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				LetturaFile(PrimoFile);
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
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

	public void LetturaSecondoFile(File SecondoFile) {
		this.Filetemp = SecondoFile;
		Status(SecondoFile);
		try {
			fr = new FileReader(SecondoFile); // Questo può generare FileNotFoundException
			inFile = new BufferedReader(fr);

			try {
				row = inFile.readLine(); // Questo può generare IOEXception
				LetturaFile(SecondoFile);
				while (row != null) { // Conosco la struttura e so che se esiste la prima riga di titolo esisteranno
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
