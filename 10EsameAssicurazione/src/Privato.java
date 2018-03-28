import java.util.List;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Privato extends Cliente {
	/**
	 * @param tipo
	 * @param codiceCliente
	 * @param codiceFiliale
	 * @param premioCorrente
	 * @param nome
	 * @param cognome
	 */

	protected String Nome, Cognome;

	/**
	 * @param nome
	 * @param cognome
	 */

	/**
	 * @param tipo
	 * @param codiceCliente
	 * @param codiceFiliale
	 * @param premioCorrente
	 * @param codiciFilialiPassate
	 * @param nome
	 * @param cognome
	 */
	public Privato(String tipo, int codiceCliente, int codiceFiliale, float premioCorrente,
			List<Integer> codiciFilialiPassate, String nome, String cognome) {
		super(tipo, codiceCliente, codiceFiliale, premioCorrente, codiciFilialiPassate);
		Nome = nome;
		Cognome = cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Privato [Nome=" + Nome + ", Cognome=" + Cognome + ", Tipo=" + Tipo + ", CodiceCliente=" + CodiceCliente
				+ ", CodiceFiliale=" + CodiceFiliale + ", PremioCorrente=" + PremioCorrente + ", CodiciFilialiPassate="
				+ CodiciFilialiPassate + "]";
	}

}
