/**
 * 
 */
package IntputOut;


import java.io.*;
import java.util.*;

/**
 * @author Giacomo
 *
 */
public class InputTextOutputBinMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
		
		File Filepartenza= new File("giuliva.txt");
		File FilediTesto1= new File("PrimoFileDiTestoGenerato.txt");
		File FileBinario1= new File("PrimoFileBinarioGenerato.txt");
		File FileBinario2= new File("SecondoFileBinarioGenerato.txt");
		int counter=0;
		
		try {
			
			
			BufferedReader lettore = new BufferedReader(reader);
			String s, nomefile, lavoro = null;
			StringTokenizer tokenizer;
			s = lettore.readLine();
			nomefile = args[0];
			//	String path="C:/nomefile.txt"
			//	File file = new File(path);
			//	FileWriter fw = new FileWriter(file);
			//	fw.write("CIAONE");
			//	fw.flush();
			//
			//
			FileWriter fw = new FileWriter(nomefile + ".txt");
			PrintWriter outFile = new PrintWriter(fw);
			// Scrittura su un file binario : FileOutputStream fos = new FileOutputStream(new File("C:\\filebinario.bin"));
			//fos.write(1); per indicare che sto scrivendo su una periferica non di default(che sarebbe lo schermo) ,ma su un file 
			// Lettura su un file binario : FileInputStream fis = new FileInputStream(new File("C:\\filebinario.bin"));
			//c=fis.read(); while(c!=-1) quando leggo un byte c decrementa fino a che non leggo l'ultimo e mi decrementa a -1 
			FileReader fr = new FileReader(nomefile + ".txt");
			BufferedReader inFile = new BufferedReader(fr);
			
			while (!s.isEmpty()) {
				// System.out.println(s);
				outFile.println(s);
				s = lettore.readLine();
			}
			System.out.println();
			outFile.close();

			try {
				s = inFile.readLine();
				while (s != null) {
					tokenizer = new StringTokenizer(s);
					while (tokenizer.hasMoreTokens()) {
						lavoro = tokenizer.nextToken();
						System.out.print(lavoro + " ");
					}
					s = inFile.readLine();
					inFile.close();
				}
			} catch (FileNotFoundException e) {
				System.out.println("Errore. File non trovato");
			}
		}

		catch (Exception e) {
			System.out.println("Errore");
		}

	}

}
