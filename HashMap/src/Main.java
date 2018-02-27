import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Le HashMap sono utilizzate principalmente per archiviare i dati in formato chiave,valore,
		 * al contrario delle Liste e degli ArrayList che assegnano un intero come index dei propri elementi
		*/
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		 //Nelle HashMap il primo campo definisce il tipo della chiave, il secondo definisce il tipo del valore <chiave,valore>
		
		map.put("A",2); //Inserimento nuovo elemento
		map.put("C",3);
		map.put("B",6);
		System.out.println(map.get("A")); //Stampa l'elemento che ha come chiave "A"
		
		System.out.println(map); //Stampa tutta la HashMap chiave=valore
		
		map.remove("C"); //Elimina l'elemento che ha come chiave "C"
		
		System.out.println(map);
		
	}
	
}
