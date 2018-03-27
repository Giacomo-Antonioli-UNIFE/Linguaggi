/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public abstract class Automobile {
	protected String Modello, Produttore;
	protected int Peso, Codice;
	
	public abstract void setModello(String Modello);
	public abstract void setProduttore(String Produttore);
	public abstract void setPeso(int Peso);
	public abstract void setCodice(int Codice);
	
	public abstract String getModello();
	public abstract String getProduttore();
	public abstract int getPeso();
	public abstract int getCodice();

}
