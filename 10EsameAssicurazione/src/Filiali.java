import java.util.*;

public class Filiali {
	protected String Nome, Indirizzo;
	protected int Codice;
	protected List<Cliente> Assicurati = new LinkedList<Cliente>();

	/**
	 * @param nome
	 * @param indirizzo
	 * @param codice
	 */
	public Filiali(String nome, int codice, String indirizzo) {
		Nome = nome;
		Indirizzo = indirizzo;
		Codice = codice;
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
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return Indirizzo;
	}

	/**
	 * @param indirizzo
	 *            the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	/**
	 * @return the codice
	 */
	public int getCodice() {
		return Codice;
	}

	/**
	 * @param codice
	 *            the codice to set
	 */
	public void setCodice(int codice) {
		Codice = codice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Filiali [Nome=" + Nome + ", Indirizzo=" + Indirizzo + ", Codice=" + Codice + "]";
	}
}
