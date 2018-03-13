/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Counter {

	private int val;

	public void reset() {
		val = 0;
	}

	public void increase() {
		val++;
	}

	public void increase(int n) {
		val=val+n;
	}
	
	public int getValue() {
		return val;
	}
}
