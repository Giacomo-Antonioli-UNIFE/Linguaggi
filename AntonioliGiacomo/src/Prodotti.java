public class Prodotti {
	protected String Tipo, Descrizione;
	protected float Prezzo, MateriePrime;

	public Prodotti(String tipo, String descrizione, float prezzo,
			float materiePrime) {
		super();
		Tipo = tipo;
		Descrizione = descrizione;
		Prezzo = prezzo;
		MateriePrime = materiePrime;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public float getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}

	public float getMateriePrime() {
		return MateriePrime;
	}

	public void setMateriePrime(float materiePrime) {
		MateriePrime = materiePrime;
	}

	public void StampaPiatti() {
		System.out.println(Tipo + "\t" + Descrizione + "\t" + Prezzo + "\t"
				+ MateriePrime);
	}

	@Override
	public String toString() {
		return "\n" + Tipo + "\t" + Descrizione + "\t" + Prezzo + "\t"
				+ MateriePrime;
	}

}
