/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Azienda extends Individuo {

	protected String RagioneSociale;

	/**
	 * @param type
	 * @param address
	 * @param account
	 * @param password
	 * @param iD
	 * @param name
	 * @param surname
	 * @param ragioneSociale
	 */
	public Azienda(String type, String address, String account, String password, int iD, String name, String surname,
			String ragioneSociale) {
		super(type, address, account, password, iD, name, surname);
		RagioneSociale = ragioneSociale;
	}

	/**
	 * @return the ragioneSociale
	 */
	public String getNome() {
		return RagioneSociale;
	}

	/**
	 * @param ragioneSociale
	 *            the ragioneSociale to set
	 */
	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Azienda [RagioneSociale=" + RagioneSociale + ", Name=" + Name + ", Surname=" + Surname + ", Type="
				+ Type + ", Address=" + Address + ", Account=" + Account + ", Password=" + Password + ", ID=" + ID
				+ ", Seguace=" + Seguace.size() + "]";
	}

}
