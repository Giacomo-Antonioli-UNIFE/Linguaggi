import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Un Set é una collezione di dati che non ammette duplicati, una delle implementazioni dei Sets é la classe HashSet
		 */
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("A"); //Inserimento dell'elemento "A"
		set.add("B");
		set.add("C");
		
		System.out.println(set); //Stampa gli elementi del Set
		System.out.println(set.size()); //Stampa il numero di elementi contenuti nel Set
	}

}
