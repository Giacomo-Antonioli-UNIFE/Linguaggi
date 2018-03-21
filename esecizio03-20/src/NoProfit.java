/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class NoProfit extends Organizzazione implements Tassazione {

	/**
	 * 
	 */
	float tassazione;
	public NoProfit() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see Tassazione#setTassazione(float)
	 */
	@Override
	public void setTassazione(float Tasse) {
		// TODO Auto-generated method stub
		tassazione=Tasse;
	}

	/* (non-Javadoc)
	 * @see Tassazione#getTassazione()
	 */
	@Override
	public float getTassazione() {
		// TODO Auto-generated method stub
		return tassazione;
	}

	/* (non-Javadoc)
	 * @see Organizzazione#setBilancio(float)
	 */
	@Override
	public void setBilancio(float Bilancio) {
		// TODO Auto-generated method stub
		this.Bilancio=Bilancio;

	}

	/* (non-Javadoc)
	 * @see Organizzazione#getBilancio()
	 */
	@Override
	public float getBilancio() {
		
		return Bilancio;
	}

}
