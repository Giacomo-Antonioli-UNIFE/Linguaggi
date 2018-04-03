/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Azienda extends Cliente {
	protected String RagioneSociale;
	protected double Portata;

	/**
	 * @param tipo
	 * @param contratto
	 * @param indirizzo
	 * @param iD
	 * @param ragioneSociale
	 * @param portata
	 */
	public Azienda(String tipo, String contratto, String indirizzo, int iD, String ragioneSociale, double portata) {
		super(tipo, contratto, indirizzo, iD);
		RagioneSociale = ragioneSociale;
		Portata = portata;
	}

	/**
	 * @return the ragioneSociale
	 */
	public String getRagioneSociale() {
		return RagioneSociale;
	}

	/**
	 * @param ragioneSociale
	 *            the ragioneSociale to set
	 */
	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	/**
	 * @return the portata
	 */
	public double getPortata() {
		return Portata;
	}

	/**
	 * @param portata
	 *            the portata to set
	 */
	public void setPortata(double portata) {
		Portata = portata;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ID + "\t" + Tipo + "\t-\t" + RagioneSociale + "\t" + Indirizzo + "\t" + Contratto + "\t" + Portata;
	}

}
