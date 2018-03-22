/**
 * 
 */
package InputOutput;

import java.util.*;
import java.io.*;

/**
 * @author Giacomo
 *
 */
public class MainIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
try {
		BufferedReader lettore = new BufferedReader(reader);
		String s, nomefile, lavoro;
		StringTokenizer tokenizer;
		s=lettore.readLine();
		nomefile=args[0];
		FileWriter fw = new FileWriter(nomefile+".txt"); 
		PrintWriter outFile = new PrintWriter(fw);
		FileReader fr = new FileReader(nomefile+".txt");
		BufferedReader inFile = new BufferedReader(fr);
		while(!s.isEmpty())
		{	
			//System.out.println(s);
			outFile.println(s);
			s=lettore.readLine();
		}
		System.out.println();
		outFile.close();
		
		try
		{
		s= inFile.readLine();
		while(s!=null)
		{
		tokenizer =new StringTokenizer(s);
		lavoro=tokenizer.nextToken();
		s=inFile.readLine();
		System.out.println(lavoro);
		}
		}
		catch(FileNotFoundException e )
		{
			System.out.println("Errore. File non trovato");
		}
		}

	catch(Exception e)
	{
		System.out.println("Errore");
	}
		
	}
}
