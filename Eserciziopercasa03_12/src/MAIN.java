/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class MAIN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		
		counter.initialize();
		//-------------------------------
		// Metodo 1
		//counter.increment();
		//counter.increment();
		//-------------------------------
		// Metodo 2
		counter.increment(2);
		counter.increment();
		//-------------------------------
		counter.print();
		counter.decrement();
		counter.print();
	}

}
