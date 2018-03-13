import java.io.*;
import java.util.*;

public class Lettura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line, name; //Variabili di appoggio 
		int units, count = 0;
		float price;
		String file = "inventory.txt"; //Nome del file da leggere
		
		InventoryItem[] items = new InventoryItem[100]; /// Array di oggetti di InventoryItem
		StringTokenizer tokenizer;	//Stumento utile per leggere dati separati da spazio
		
		try {
			FileReader fr = new FileReader(file); //Apertura del file 'inventory.exe' in modalità lettura
			BufferedReader inFile = new BufferedReader(fr); //Strumento utile per trasformare una sequenza di byte letti in caratteri
			line = inFile.readLine(); //Legge la prima riga del file, quando finisce di leggere il file ritorna null
			while(line!=null) {
				tokenizer = new StringTokenizer(line); //Separa la stringa 'parola per parola'
				name = tokenizer.nextToken();	//Inserisce in name la prima 'parola' della riga
				try {
					units = Integer.parseInt(tokenizer.nextToken());//Converte in intero la 'parola' successiva della riga e la inserisce in units
					price = Float.parseFloat(tokenizer.nextToken());//Converte in float la 'parola' successiva della riga e la inserisce in units
					items[count++] = new InventoryItem(name,units,price);//Inserisce i dat appena letti nell'array di oggetti InventoryItem
				}catch (NumberFormatException e)//Gestione dell'eccezioni relative a parseInt e parseFloat
					{System.out.println("error in input. Line:"+line);}
				line = inFile.readLine(); //Passa alla riga successiva
			}
			inFile.close();//Chiude il file
			
			for(int scan = 0; scan < count; scan++)
				System.out.println(items[scan]); //Stampa tutti i dati contenuti nell'array
			
		}catch (FileNotFoundException e) { //Gestione dell'eccezione in cui il file non risulti presente
			System.out.println("File " + file + " not found.");
		}catch (IOException e) { // Gestione delle varie eccezioni relative all' Input/Output
			System.out.println(e);
		}
		
	}

}
