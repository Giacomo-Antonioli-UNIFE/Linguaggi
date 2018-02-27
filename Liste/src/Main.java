import java.util.LinkedList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		
		LinkedList<String> lista = new LinkedList<String>();
		
		lista.add("Pippo"); //Inserisco "Pippo" nella lista
		lista.add("Pluto");
		lista.add("Topolino");
		
		System.out.println(lista); //Stampo lista
		
		lista.remove("Pluto");
		
		lista.add("Minni");
		
		System.out.println(lista);
		
		Collections.sort(lista); //Ordino la lista, in questo caso in ordine alfabetico
		
		System.out.println(lista);
		
		lista.clear(); //Svuoto Lista
		
		System.out.println(lista);
		
	}

}
