public class Pub extends Ristorante {
	protected int Dipendenti, Tavoli;

	public Pub(int iD, String tipo, String nome, int dipendenti, int tavoli) {
		super(iD, tipo, nome);
		Dipendenti = dipendenti;
		Tavoli = tavoli;
	}

	public int getDipendenti() {
		return Dipendenti;
	}

	public void setDipendenti(int dipendenti) {
		Dipendenti = dipendenti;
	}

	public int getTavoli() {
		return Tavoli;
	}

	public void setTavoli(int tavoli) {
		Tavoli = tavoli;
	}

	@Override
	public String toString() {
		return Nome + "\t" + ID + "\t" + Tipo + "\t" + Dipendenti + "\t"
				+ Tavoli + "\t-\t-\t-\t";
	}

}
