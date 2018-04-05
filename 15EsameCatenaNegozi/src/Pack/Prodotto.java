package Pack;

public class Prodotto {
	protected String Descrizione;
	protected int quantita, prezzo;
	public Prodotto(String descrizione, int quantita, int prezzo) {
		Descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public int getQuantita() {
		return quantita;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Prodotto [Descrizione=" + Descrizione + ", quantita=" + quantita + ", prezzo=" + prezzo + "]";
	}
	
}
