package Pack;

public abstract class Negozio {
	protected int ID, Superfice;
	protected String Tipo, Indirizzo;

	public Negozio(int iD, int superfice, String tipo, String indirizzo) {
		ID = iD;
		Superfice = superfice;
		Tipo = tipo;
		Indirizzo = indirizzo;
	}

	public int getID() {
		return ID;
	}

	public int getSuperfice() {
		return Superfice;
	}

	public String getTipo() {
		return Tipo;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setSuperfice(int superfice) {
		Superfice = superfice;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

}
