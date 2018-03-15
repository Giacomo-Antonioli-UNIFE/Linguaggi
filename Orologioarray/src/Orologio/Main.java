/**
 * 
 */
package Orologio;

/**
 * @author Giacomo
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock o;
		o = new Clock();
		o.init();
		o.tic();
		o.tic();
		System.out.println(o.getOre());
		System.out.println(o.getMinuti());
		o.reset();

	}

}
