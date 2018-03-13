/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class CounterDec {

	private Counter c = new Counter();

	public void reset() {
		c.reset();
	}

	public void increase() {
		c.increase();
	}

	public int getValue() {
		return c.getValue();
	}

	public void decrease() {
		int l;
		l = c.getValue();
		l--;
		c.reset();
		c.increase(l);
	}

	public void print() {
		System.out.println(c.getValue());
	}
}
