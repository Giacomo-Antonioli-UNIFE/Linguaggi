import java.io.*;
import java.util.*;

/**
 * 
 * @author Giacomo_Antonioli
 * @Esame Linguaggi_Di_Programmazione
 * @Matricola 128847
 * 
 */
public class Main {

	public static void main(String[] args) {

		// TODO LIST
		/**
		 * 1) Creare Classi e Estensioni 2) Creare Liste o Mappe 3) Modificare i
		 * metodi della Classe Lettura aggiungendo Le Liste e le Mappe
		 * 
		 */
		List<Ristorante> Ristoranti = new LinkedList<Ristorante>();
		List<Menu> Carta = new LinkedList<Menu>();
		Map<Integer, String> id_to_name = new HashMap<Integer, String>();

		final File PrimoFile = new File("ristoranti.txt");
		final File SecondoFile = new File("menu.txt");
		Lettura Reader = new Lettura();
		Auxiliary aux = new Auxiliary();
		aux.Presentazione();
		try {
			aux.Punto();
			// Lettura E Salvataggio Dati Dal Primo File Di Testo
			Reader.LetturaPrimoFile(PrimoFile, Ristoranti, id_to_name);

			aux.Punto();
			// Lettura E Salvataggio Dati Dal Secondo File Di Testo
			Reader.LetturaSecondoFile(SecondoFile, Carta);

			// PUNTO 3
			aux.Punto();
			aux.StampaFormato1(Ristoranti);
			// PUNTO 4
			aux.Punto();
			aux.StampaPunto4(Carta, id_to_name);

			// PUNTO 5
			aux.Punto();
			aux.Punto5(Carta, id_to_name);

		} catch (Exception e) {
			System.out.println(e);
		}

		aux.FineProgramma();

	}
}
