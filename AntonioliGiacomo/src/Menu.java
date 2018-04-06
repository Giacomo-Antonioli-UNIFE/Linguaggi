import java.util.*;

public class Menu {
	protected int CodiceRistorante;
	protected List<Prodotti> Piatti = new LinkedList<Prodotti>();

	public Menu(int codiceRistorante) {
		super();
		CodiceRistorante = codiceRistorante;

	}

	public int getCodiceRistorante() {
		return CodiceRistorante;
	}

	public void setCodiceRistorante(int codiceRistorante) {
		CodiceRistorante = codiceRistorante;
	}

	public List<Prodotti> getPiatti() {
		return Piatti;
	}

	public void setPiatti(Prodotti item) {
		Piatti.add(item);
	}

	public float getTot() {
		float temp = 0;
		int count = Piatti.size();
		for (Prodotti p : Piatti) {
			temp += p.getPrezzo();
		}
		return temp / count;
	}

	@Override
	public String toString() {
		return "Piatti: " + Piatti;
	}

}
