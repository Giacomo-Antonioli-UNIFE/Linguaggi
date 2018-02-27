import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Gli ArrayList hanno una dimensione prefissata solo che al contrario degli Array normali,
		la loro dimensione si adatta alle nostre occorrenze*/ 
		
		ArrayList<String> colors = new ArrayList<String>(2);  //Array inizializzato con una dimensione di 2 elementi
		colors.add("Red"); //Inserimento primo elemento
		colors.add("Green");
		colors.add("Blue"); /*Inserimento terzo elemento, la dimensione dell'array passa da 2 a 3,viene allocato un nuovo spazion in memoria
							per il nuovo elemento*/
		
		System.out.println(colors); //Print di tutti gli elementi
		
		colors.remove("Green");	//Elimino un elemento, la dimensione torna a 2 e viene deallocato lo spazio aggiunto in precedenza
		
		System.out.println(colors);
		
		/*Considerazioni Generali
		 * 
		 * Gli ArrayList sono preferiti alle liste solo se devono trattare una quantità di record considerevolmente piccola,
		 * per grandi quantità di record si preferiscono di gran lunga le Liste
		 * 
		 */
		
		}

}
