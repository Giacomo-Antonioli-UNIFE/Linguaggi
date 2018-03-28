import java.util.*;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Cliente {
	protected String Tipo;
	protected int CodiceCliente, CodiceFiliale;
	protected float PremioCorrente;
	List<Integer> CodiciFilialiPassate = new LinkedList<Integer>();

	/**
	 * @param tipo
	 * @param codiceCliente
	 * @param codiceFiliale
	 * @param premioCorrente
	 * @param codiciFilialiPassate
	 */
	public Cliente(String tipo, int codiceCliente, int codiceFiliale, float premioCorrente,
			List<Integer> codiciFilialiPassate) {
		super();
		Tipo = tipo;
		CodiceCliente = codiceCliente;
		CodiceFiliale = codiceFiliale;
		PremioCorrente = premioCorrente;
		CodiciFilialiPassate = codiciFilialiPassate;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	/**
	 * @return the codiceCliente
	 */
	public int getCodiceCliente() {
		return CodiceCliente;
	}

	/**
	 * @param codiceCliente
	 *            the codiceCliente to set
	 */
	public void setCodiceCliente(int codiceCliente) {
		CodiceCliente = codiceCliente;
	}

	/**
	 * @return the codiceFiliale
	 */
	public int getCodiceFiliale() {
		return CodiceFiliale;
	}

	/**
	 * @param codiceFiliale
	 *            the codiceFiliale to set
	 */
	public void setCodiceFiliale(int codiceFiliale) {
		CodiceFiliale = codiceFiliale;
	}

	/**
	 * @return the premioCorrente
	 */
	public float getPremioCorrente() {
		return PremioCorrente;
	}

	/**
	 * @param premioCorrente
	 *            the premioCorrente to set
	 */
	public void setPremioCorrente(float premioCorrente) {
		PremioCorrente = premioCorrente;
	}

	/**
	 * @return the codiciFilialiPassate
	 */
	public List<Integer> getCodiciFilialiPassate() {
		return CodiciFilialiPassate;
	}

	/**
	 * @param codiciFilialiPassate
	 *            the codiciFilialiPassate to set
	 */
	public void setCodiciFilialiPassate(int codiciFilialiPassate) {
		CodiciFilialiPassate.add(codiciFilialiPassate);
	}

	/**
	 * @param tipo
	 * @param codiceCliente
	 * @param codiceFiliale
	 * @param premioCorrente
	 * @param codiciFilialiPassate
	 */
	public boolean Search(int i) {
		boolean trovato = false;
		for (Integer a : CodiciFilialiPassate) {
			if (a.intValue()==i)
				trovato = true;
			System.out.println(a.intValue()+" " + trovato);
		}
		return trovato;
	}

}
