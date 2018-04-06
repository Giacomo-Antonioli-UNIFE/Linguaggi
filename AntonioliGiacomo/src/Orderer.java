import java.util.Comparator;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Orderer implements Comparator<Ristorante> {

	@Override
	public int compare(Ristorante arg0, Ristorante arg1) {

		if (arg0.getID() > arg1.getID()) {
			return 1;
		} else {
			return -1;
		}
	}

}
