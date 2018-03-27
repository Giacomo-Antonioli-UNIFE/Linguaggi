/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Basket extends Squadra {

	protected float PunteggioMedio;

	public Basket(int Partitevinte, int Partiteperse, int Codice, String Nome, String Sport, Float PunteggioMedio) {
		super(Partitevinte, Partiteperse, Codice, Nome, Sport);
		// TODO Auto-generated constructor stub
		this.PunteggioMedio = PunteggioMedio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Basket [PunteggioMedio=" + PunteggioMedio + ", Partevinte=" + Partevinte + ", Partiteperse="
				+ Partiteperse + ", Codice=" + Codice + ", Nome=" + Nome + ", Sport=" + Sport + "]";
	}

	/**
	 * @return the punteggioMedio
	 */
	public float getPunteggioMedio() {
		return PunteggioMedio;
	}

	/**
	 * @param punteggioMedio the punteggioMedio to set
	 */
	public void setPunteggioMedio(float punteggioMedio) {
		PunteggioMedio = punteggioMedio;
	}

}
