/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Berlina extends Automobile {

	public Berlina(String Modello, String Produttore, double Bagagliaio, int Peso, int Codice) {
		setModello(Modello);
		setProduttore(Produttore);
		setBagagliaio(Bagagliaio);
		setPeso(Peso);
		setCodice(Codice);
	}

	protected double Bagagliaio;

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#setModello(java.lang.String)
	 */
	@Override
	public void setModello(String Modello) {
		// TODO Auto-generated method stub
		this.Modello = Modello;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#setProduttore(java.lang.String)
	 */
	@Override
	public void setProduttore(String Produttore) {
		// TODO Auto-generated method stub
		this.Produttore = Produttore;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#setPeso(int)
	 */
	@Override
	public void setPeso(int Peso) {
		// TODO Auto-generated method stub
		this.Peso = Peso;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#setCodice(int)
	 */
	@Override
	public void setCodice(int Codice) {
		// TODO Auto-generated method stub
		this.Codice = Codice;
	}

	public void setBagagliaio(double Bagagliaio) {
		this.Bagagliaio = Bagagliaio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#getModello()
	 */
	@Override
	public String getModello() {
		// TODO Auto-generated method stub
		return Modello;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#getProduttore()
	 */
	@Override
	public String getProduttore() {
		// TODO Auto-generated method stub
		return Produttore;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#getPeso()
	 */
	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return Peso;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Automobile#getCodice()
	 */
	@Override
	public int getCodice() {
		// TODO Auto-generated method stub
		return Codice;
	}

	public double getBagagliaio() {
		return Bagagliaio;
	}

	public String toString() {
		return Codice + "\t" + Produttore + "\t" + Modello + "\t" + Bagagliaio + "\t-\t";
	}
}
