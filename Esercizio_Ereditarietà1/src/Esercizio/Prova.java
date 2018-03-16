/**
 * 
 */
package Esercizio;

/**
 * @author Giacomo
 *
 */
public class Prova {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interi[] v;
		int n;

		n = Integer.parseInt(args[0]);

		v = new Interi[n];
		for (int i = 0; i < n; i++) {
			v[i] = new InteriPari(i);
		}

		for (int i = 0; i < n; i++) {
			v[i].stampa();
		}
	}

}
