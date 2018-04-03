/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Residente extends Cliente {
	protected String Nome, Cognome;

	/**
	 * @param tipo
	 * @param contratto
	 * @param indirizzo
	 * @param iD
	 * @param nome
	 * @param cognome
	 */
	public Residente(String tipo, String contratto, String indirizzo, int iD, String nome, String cognome) {
		super(tipo, contratto, indirizzo, iD);
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
		return ID + "\t"+Tipo+"\t"+ Nome +" "+ Cognome + "\t-\t" + Indirizzo + "\t"+ Contratto+"\t-\t";
	}

}
