package Pack;

public abstract class Cliente {
	protected int ID;
	protected String Tipo, Indirizzo;
	public Cliente(int iD, String tipo, String indirizzo) {
		ID = iD;
		Tipo = tipo;
		Indirizzo = indirizzo;
	}
	public int getID() {
		return ID;
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
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}
	
	
}
