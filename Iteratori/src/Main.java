import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		
		/*
		 * Un Iteratore è un oggetto che permette di iterare una 'collezione di dati'(Liste,ArrayList,HashMap) attraverso un ciclo.
		 * Prima di accedere alla collezione tramite un Iteratore, bisogna prima ottenerne uno.
		 * Ogni collezione prevede un metodo Iteratore che ritorna un iteratore all'inizio della collezione.
		 * Attraverso questo Iteratore è possibile accedere ad ogni elemento della collezione, un elemento per volta.
		 * 
		 * La classe Iteratore prevede metodi come:
		 * 		hasNext() che ritorna true se c'é almeno un altro elemento, ritorna falso se il contrario.
		 * 		next() ritorna l'elemento successivo e avanza l'iteratore.
		 * 		remove() Rimuove l'ultimo elemento della collezione ritornato dal metodo next().
		 */
		
		LinkedList<String> lista = new LinkedList<String>(); //Crea una lista.
		
		lista.add("Pippo"); 	//Inserisce tre elementi nella lista.
		lista.add("Pluto");
		lista.add("Topolino");
		
		Iterator<String> it = lista.iterator();	 // Ottengo l'Iteratore necessario per accedere alla collezione.
		
		//Il tipo dell'iteratore deve essere uguale a quello degli elementi della collezione.
												
		
		while(it.hasNext()) { //Fin quando it.hasNext() ritorna true, ovvero ci sono altri elementi nella collezione.
			String val = it.next(); //val uguale all'elemento ritornato dal metodo next().
			System.out.println(val); //Stampa val.
		}
		
		
	}

}