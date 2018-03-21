/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Commerciale extends Organizzazione implements Tassazione {
	protected float Tassazione;

	public void setTassazione(float Tasse) {
		this.Tassazione = Tasse;

	}

	public float getTassazione() {
		return Tassazione;
	}

	public void setBilancio(float Bilancio) {
		this.Bilancio = Bilancio;
	}

	public float getBilancio() {
		return Bilancio;
	}

}
