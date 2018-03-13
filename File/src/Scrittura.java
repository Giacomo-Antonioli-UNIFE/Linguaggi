import java.io.*;


public class Scrittura{
	public static void main(String[] args) throws IOException{//Dichiariamo che possono generarsi eccezioni di tipo IO
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("tabelline.txt"); //Creazione del file 'tabelline.txt' in modalità scrittura
		PrintWriter outFile = new PrintWriter(fw);//Strumento utile per scrivere righe di testo
		for (int i=1; i<=10; i++)
			{
				for (int j=1; j<=10; j++)
					{
						outFile.print((i*j)+" "); //Scrive su file il risultato della moltiplicazione tra i e j
					}
				
				outFile.println();//Scrive la riga creata nel ciclo sul file e passa alla successiva
			}
		
		outFile.close();//Chiude il file salvandolo
	}

}
