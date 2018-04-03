/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Cliente {
	protected String Tipo,Contratto, Indirizzo;
	protected int ID;
	/**
	 * @param tipo
	 * @param contratto
	 * @param indirizzo
	 * @param iD
	 */
	public Cliente(String tipo, String contratto, String indirizzo, int iD) {
		super();
		Tipo = tipo;
		Contratto = contratto;
		Indirizzo = indirizzo;
		ID = iD;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	/**
	 * @return the contratto
	 */
	public String getContratto() {
		return Contratto;
	}
	/**
	 * @param contratto the contratto to set
	 */
	public void setContratto(String contratto) {
		Contratto = contratto;
	}
	/**
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return Indirizzo;
	}
	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	
}
