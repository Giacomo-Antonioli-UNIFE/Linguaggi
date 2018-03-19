/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaggio Heman = new Hero();
		Personaggio Alucard = new Vampire();
		Personaggio Lucio = new Werewolf(true);

		Heman.Attack();
		Heman.Attack();
		Heman.Attack();
		Alucard.Attack();
		Lucio.Attack();
		Heman.StampaForza();
		Alucard.StampaForza();
		Lucio.StampaForza();
		// ----------------------------------------------------------------------------
		Lucio.setType(true);
		Lucio.Attack();
		Lucio.StampaForza();
		// ----------------------------------------------------------------------------
	}

}
