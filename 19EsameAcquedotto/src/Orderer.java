import java.util.Comparator;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Orderer implements Comparator<Cliente> {

	@Override
	public int compare(Cliente arg0, Cliente arg1) {
//		String a = arg0.getTipo(), b = arg1.getTipo();
//		if (a.compareTo(b) > 0) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
		if (arg0.getID() > arg1.getID()) {
			return 1;
		} else {
			return -1;
		}
	}

}
