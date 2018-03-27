/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Giocatore {

	protected int Codicesquadra, Eta, NumeroMaglia;
	protected String Cognome, Ruolo;
	protected boolean Titolare;

	public Giocatore(int codicesquadra, int eta, int numeroMaglia, String cognome, String ruolo, boolean titolare) {

		Codicesquadra = codicesquadra;
		Eta = eta;
		NumeroMaglia = numeroMaglia;
		Cognome = cognome;
		Ruolo = ruolo;
		Titolare = titolare;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Giocatore [Codicesquadra=" + Codicesquadra + ", Eta=" + Eta + ", NumeroMaglia=" + NumeroMaglia
				+ ", Cognome=" + Cognome + ", Ruolo=" + Ruolo + ", Titolare=" + Titolare + "]";
	}

	/**
	 * @return the codicesquadra
	 */
	public int getCodicesquadra() {
		return Codicesquadra;
	}

	/**
	 * @param codicesquadra
	 *            the codicesquadra to set
	 */
	public void setCodicesquadra(int codicesquadra) {
		Codicesquadra = codicesquadra;
	}

	/**
	 * @return the eta
	 */
	public int getEta() {
		return Eta;
	}

	/**
	 * @param eta
	 *            the eta to set
	 */
	public void setEta(int eta) {
		Eta = eta;
	}

	/**
	 * @return the numeroMaglia
	 */
	public int getNumeroMaglia() {
		return NumeroMaglia;
	}

	/**
	 * @param numeroMaglia
	 *            the numeroMaglia to set
	 */
	public void setNumeroMaglia(int numeroMaglia) {
		NumeroMaglia = numeroMaglia;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return Cognome;
	}

	/**
	 * @param cognome
	 *            the cognome to set
	 */
	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	/**
	 * @return the ruolo
	 */
	public String getRuolo() {
		return Ruolo;
	}

	/**
	 * @param ruolo
	 *            the ruolo to set
	 */
	public void setRuolo(String ruolo) {
		Ruolo = ruolo;
	}

	/**
	 * @return the titolare
	 */
	public Boolean getTitolare() {
		return Titolare;
	}

	/**
	 * @param titolare
	 *            the titolare to set
	 */
	public void setTitolare(Boolean titolare) {
		Titolare = titolare;
	}
}
