/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Counter {
	private int var;

	public void initialize() {
		var = 0;
	}

	public void increment() {
		var++;
		
	}

	public void increment(int inc) {
		var= var+ inc;
	}

	public void decrement() {
		var--;
	}

	public void print() {

		System.out.println("Counter value: " + var);
	}

}
