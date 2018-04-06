import java.io.*;
import java.util.*;


/**
 * 
 * @author Giacomo_Antonioli
 * @Esame Linguaggi_Di_Programmazione
 * @Matricola 128847
 * 
 */
public class MainTipico2 {

	public static void main(String[] args) {
		
		//TODO LIST
		/**
		 *  1) Creare Classi e Estensioni
		 *  2) Creare Liste o Mappe
		 *  3) Modificare i metodi della Classe Lettura aggiungendo Le Liste e le Mappe
		 *  
		 */

		final File PrimoFile = new File("filiali.txt");
		final File SecondoFile = new File("clienti.txt");
		Lettura Reader = new Lettura();
		Auxiliary aux = new Auxiliary();
		aux.Presentazione();
		try {
			aux.Punto();
			// Lettura E Salvataggio Dati Dal Primo File Di Testo
			Reader.LetturaPrimoFile(PrimoFile);
			aux.Punto();
			// Lettura E Salvataggio Dati Dal Secondo File Di Testo
			Reader.LetturaSecondoFile(SecondoFile);

			// PUNTO 3
			aux.Punto();
			// PUNTO 4
			aux.Punto();
			// PUNTO 5
			aux.Punto();
			// PUNTO 6
			aux.Punto();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
