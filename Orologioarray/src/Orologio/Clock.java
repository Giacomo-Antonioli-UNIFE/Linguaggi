/**
 * 
 */
package Orologio;

/**
 * @author Giacomo
 *
 */
public class Clock {
	private Counter[] array;

	public void init() {

		array = new Counter[2];
		array[0] = new Counter();//minuti
		array[1] = new Counter();//ore
	}

	public void reset() {
		array[0].reset();
		array[1].reset();
	}

	public void tic() {
		array[0].inc();
		if (array[0].getValue() == 60) {
			array[0].reset();
			array[1].inc();
		}
		if (array[1].getValue() == 24)
			array[1].reset();
	}

	public int getOre() {
		return array[1].getValue();
	}

	public int getMinuti() {
		return array[0].getValue();
	}

}
