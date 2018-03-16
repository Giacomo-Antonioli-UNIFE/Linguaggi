/**
 * 
 */
package Esercizio;

/**
 * @author Giacomo
 *
 */
public class InteriPari extends Interi {

	public InteriPari(int n) {// se faccio il costruttore di una estensione devo mettere come primo il
								// costruttore precedente
		super();
		if (n % 2 == 0) {

			valore = n;
		}
	}

	public void stampa() {
		super.stampa();
	}
}
