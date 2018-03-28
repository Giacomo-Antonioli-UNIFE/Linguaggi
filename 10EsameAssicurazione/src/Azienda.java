import java.util.List;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Azienda extends Cliente {
	protected String RagioneSociale;
	protected float PremioPiuTasse;

	/**
	 * @return the ragioneSociale
	 */
	public String getRagioneSociale() {
		return RagioneSociale;
	}

	/**
	 * @param tipo
	 * @param codiceCliente
	 * @param codiceFiliale
	 * @param premioCorrente
	 * @param codiciFilialiPassate
	 * @param ragioneSociale
	 * @param premioPiuTasse
	 */
	public Azienda(String tipo, int codiceCliente, int codiceFiliale, float premioCorrente,
			List<Integer> codiciFilialiPassate, String ragioneSociale, float premioPiuTasse) {
		super(tipo, codiceCliente, codiceFiliale, premioCorrente, codiciFilialiPassate);
		RagioneSociale = ragioneSociale;
		PremioPiuTasse = premioPiuTasse;
	}

	/**
	 * @param ragioneSociale
	 *            the ragioneSociale to set
	 */
	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	/**
	 * @return the premioPiuTasse
	 */
	public float getPremioPiuTasse() {
		return PremioPiuTasse;
	}

	/**
	 * @param premioPiuTasse
	 *            the premioPiuTasse to set
	 */
	public void setPremioPiuTasse(float premioPiuTasse) {
		PremioPiuTasse = premioPiuTasse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Azienda [RagioneSociale=" + RagioneSociale + ", PremioPiuTasse=" + PremioPiuTasse + ", Tipo=" + Tipo
				+ ", CodiceCliente=" + CodiceCliente + ", CodiceFiliale=" + CodiceFiliale + ", PremioCorrente="
				+ PremioCorrente + ", CodiciFilialiPassate=" + CodiciFilialiPassate + "]";
	}

}
