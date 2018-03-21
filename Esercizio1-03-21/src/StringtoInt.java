/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class StringtoInt {
	public StringtoInt(String s) throws IllegalArgumentException {

		int a = Integer.parseInt(s);

		if (a > 10 | a < -10) {
			IllegalArgumentException illegal = new IllegalArgumentException("Numero non compreso tra -10 e 10");
			throw illegal;
		}

	}

}
