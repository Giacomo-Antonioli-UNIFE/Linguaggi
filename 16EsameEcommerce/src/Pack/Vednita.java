package Pack;

import java.util.List;

public class Vednita {
	protected int CodiceVendita, CodiceCliente, Giorno, Mese, Anno, Quantita, Prezzo;
	protected String Descrizione;

	public Vednita(int codiceVendita, int codiceCliente, int giorno, int mese, int anno, String descrizione,
			int quantita, int prezzo) {
		CodiceVendita = codiceVendita;
		CodiceCliente = codiceCliente;
		Giorno = giorno;
		Mese = mese;
		Anno = anno;
		Descrizione = descrizione;
		Quantita = quantita;
		Prezzo = prezzo;
	}

	public int getCodiceVendita() {
		return CodiceVendita;
	}

	public int getCodiceCliente() {
		return CodiceCliente;
	}

	public int getGiorno() {
		return Giorno;
	}

	public int getMese() {
		return Mese;
	}

	public int getAnno() {
		return Anno;
	}

	public int getQuantita() {
		return Quantita;
	}

	public int getPrezzo() {
		return Prezzo;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setCodiceVendita(int codiceVendita) {
		CodiceVendita = codiceVendita;
	}

	public void setCodiceCliente(int codiceCliente) {
		CodiceCliente = codiceCliente;
	}

	public void setGiorno(int giorno) {
		Giorno = giorno;
	}

	public void setMese(int mese) {
		Mese = mese;
	}

	public void setAnno(int anno) {
		Anno = anno;
	}

	public void setQuantita(int quantita) {
		Quantita = quantita;
	}

	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public String RicercaIndirizzo(List<Cliente> Clienti, int Codice) {
		for (Cliente c : Clienti) {
			int codetemp = c.getID();
			if (codetemp == Codice) {
				return c.getIndirizzo();
			}

		}
		return "Not Found";
	}

	public String getData() {
		return Giorno + " " + Mese + " " + Anno;
	}

	public void Stampa(List<Cliente> Clienti) {
		System.out.println(CodiceVendita + "\t" + CodiceCliente + "\t" + RicercaIndirizzo(Clienti, CodiceCliente) + "\t"
				+ getData() + "\t" + Descrizione + "\t" + Quantita + "\t" + Prezzo + "\t" + (Quantita * Prezzo) + "\t"
				+ (Quantita * Prezzo) / 1.22);
	}

	@Override
	public String toString() {
		return "Vednita [CodiceVendita=" + CodiceVendita + ", CodiceCliente=" + CodiceCliente + ", Giorno=" + Giorno
				+ ", Mese=" + Mese + ", Anno=" + Anno + ", Quantita=" + Quantita + ", Prezzo=" + Prezzo
				+ ", Descrizione=" + Descrizione + "]";
	}

}
