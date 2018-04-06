public abstract class Ristorante {
	protected int ID;
	protected String Tipo, Nome;

	public Ristorante(int iD, String tipo, String nome) {
		super();
		ID = iD;
		Tipo = tipo;
		Nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
