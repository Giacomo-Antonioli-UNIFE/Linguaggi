import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class EsameBerlinaFuoristradaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String nomefile = "ordini.txt";
//		String row;
//		StringTokenizer tokenizer;
//		String tipo, Modello, Produttore, BagMarce;
//		int Peso, Codice;
//
//		List<Automobile> Ordini = new ArrayList<Automobile>();
//
//		try {
//			FileReader fr = new FileReader(nomefile);
//			BufferedReader inFile = new BufferedReader(fr);
//
//			try {
//				row = inFile.readLine();
//				while (row != null) {
//					tokenizer = new StringTokenizer(row);
//
//					tipo = tokenizer.nextToken();
//					Modello = tokenizer.nextToken();
//					Produttore = tokenizer.nextToken();
//					BagMarce = tokenizer.nextToken();
//					Peso = Integer.parseInt(tokenizer.nextToken());
//					Codice = Integer.parseInt(tokenizer.nextToken());
//
//					if (tipo.equals("b")) {
//						Automobile a = new Berlina(Modello, Produttore, Double.parseDouble(BagMarce), Peso, Codice);
//						Ordini.add(a);
//					} else {
//						Automobile a = new Fuoristrada(Modello, Produttore, Integer.parseInt(BagMarce), Peso, Codice);
//						Ordini.add(a);
//					}
//
//					row = inFile.readLine();
//				}
//				inFile.close();
//
//				for (Automobile a : Ordini) {
//					System.out.println(a);
//				}
//
//			} catch (IOException e) {
//				System.out.println("Errore di lettura");
//			}
//
//		} catch (FileNotFoundException e) {
//			System.out.println("Errore. File non trovato");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		List<Automobile> automobili=new LinkedList<Automobile>();
	    Map<String,Integer> auto_pesi=new HashMap<String,Integer>();
	    try
	    {
	      FileReader f=new FileReader("ordini.txt");
	      BufferedReader bf= new BufferedReader(f);
	      String line=bf.readLine();
	      while (line!= null)
	      {
	        StringTokenizer tokenizer=new StringTokenizer(line);
	        String tipo=tokenizer.nextToken(); //b o f
	        String modello=tokenizer.nextToken();
	        String produttore=tokenizer.nextToken();
	        String bag_marce=tokenizer.nextToken();        
	        int peso=Integer.parseInt(tokenizer.nextToken());
	        int codice=Integer.parseInt(tokenizer.nextToken());
	        if (tipo.equals("b"))
	        {          
	          double bagagliaio=Double.parseDouble(bag_marce);
	          Automobile a=new Berlina(modello,produttore,bagagliaio,peso,codice);
	          automobili.add(a);
	        }
	        else
	        {
	          int marce=Integer.parseInt(bag_marce);
	          Automobile a=new Fuoristrada(modello,produttore,marce,peso,codice);
	          automobili.add(a);
	        }
	        line=bf.readLine();
	      }
	    }
	    catch (IOException ex)
	    {
	      System.out.println(ex);
	    }
	    
	    //PUNTO 2
	    System.out.println("Codice\tMarca\tModello\tBagagliaio\tMarce");
	    for (Automobile a : automobili)
	      System.out.println(a);
	    
	    //PUNTO 3
	    System.out.println("\nN. AUTO PER RANGE DI PESO");
	    for (Automobile a : automobili){
	            int peso = a.getPeso();
	            if (800 <= peso && peso <= 1000) {
	                Integer n=auto_pesi.get("800-1000");
	                if (n==null)
	                	auto_pesi.put("800-1000",1);
	                else
	                	auto_pesi.put("800-1000",n+1);
	            }
	            if (1000 < peso && peso <= 1500) {
	                Integer n=auto_pesi.get("1000-1500");
	                if (n==null)
	                	auto_pesi.put("1000-1500",1);
	                else
	                	auto_pesi.put("1000-1500",n+1);
	            }
	            if (1500 < peso && peso <= 2000) {
	                Integer n=auto_pesi.get("1500-2000");
	                if (n==null)
	                	auto_pesi.put("1500-2000",1);
	                else
	                	auto_pesi.put("1500-2000",n+1);
	            }
	    }//for
	    System.out.println(auto_pesi);
	    
	    //PUNTO 4
	    System.out.println("\nMODELLI PRESENTI PER LA MARCA " + args[0]);
	    for (Automobile a : automobili){
	        String prod = a.getProduttore();
	        if (prod.equals(args[0]))
	        	System.out.println(a.getModello());
	    }
	}

}
