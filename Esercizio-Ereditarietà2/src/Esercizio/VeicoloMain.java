/**
 * 
 */
package Esercizio;

/**
 * @author Giacomo
 *
 */
public class VeicoloMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile a = new Automobile("FE147GJ");
		Bicicletta b = new Bicicletta();
		a.avvia();
		a.accelera(20, 5);
		b.pedala(50, 10);
		
		a.printVelocita(a);
		b.printVelocita(b);
	}

}
