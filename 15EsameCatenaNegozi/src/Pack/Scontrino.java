package Pack;

import java.util.*;

public class Scontrino {
	protected int CodiceScontrino, CodiceNegozio;
	protected int Giorno, Mese, Anno;
	protected List<Prodotto> prodotti = new LinkedList<Prodotto>();

	public Scontrino(int codiceScontrino, int codiceNegozio, int giorno, int mese, int anno) {
		CodiceScontrino = codiceScontrino;
		CodiceNegozio = codiceNegozio;
		Giorno = giorno;
		Mese = mese;
		Anno = anno;
	}

	public int getCodiceScontrino() {
		return CodiceScontrino;
	}

	public int getCodiceNegozio() {
		return CodiceNegozio;
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

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setCodiceScontrino(int codiceScontrino) {
		CodiceScontrino = codiceScontrino;
	}

	public void setCodiceNegozio(int codiceNegozio) {
		CodiceNegozio = codiceNegozio;
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

	public void setProdotti(Prodotto prodotti) {
		this.prodotti.add(prodotti);
	}

	public void Punto4() {
		int totale = 0;
		System.out.println();
		for (Prodotto p : prodotti) {
			System.out.println(CodiceNegozio + "\t" + CodiceScontrino + "\t" + getData() + "\t" + p.Descrizione + "\t"
					+ p.quantita + "\t" + p.prezzo + "\t" + p.prezzo * p.quantita);
			totale += p.prezzo * p.quantita;
		}
		System.out.println("Il prezzo totale dello scontrino è:" + totale);
		System.out.println();
	}

	public int Punto5() {
		int totale = 0;

		System.out.println();
		for (Prodotto p : prodotti) {
			totale += p.prezzo * p.quantita;
		}
		return totale;
	}

	public String getData() {
		return Giorno + " " + Mese + " " + Anno;
	}

	@Override
	public String toString() {
		return "Scontrino [CodiceScontrino=" + CodiceScontrino + ", CodiceNegozio=" + CodiceNegozio + ", Giorno="
				+ Giorno + ", Mese=" + Mese + ", Anno=" + Anno + ", prodotti=" + prodotti + "]";
	}

}
