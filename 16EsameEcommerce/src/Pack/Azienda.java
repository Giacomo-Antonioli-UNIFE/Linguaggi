package Pack;

public class Azienda extends Cliente {
	protected String RagioneSociale, IBAN;
	protected int PartitaIva, Dipendenti;

	public Azienda(int iD, String tipo, String indirizzo, String ragioneSociale, String iBAN, int partitaIva,
			int dipendenti) {
		super(iD, tipo, indirizzo);
		RagioneSociale = ragioneSociale;
		IBAN = iBAN;
		PartitaIva = partitaIva;
		Dipendenti = dipendenti;
	}

	public String getRagioneSociale() {
		return RagioneSociale;
	}

	public String getIBAN() {
		return IBAN;
	}

	public int getPartitaIva() {
		return PartitaIva;
	}

	public int getDipendenti() {
		return Dipendenti;
	}

	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public void setPartitaIva(int partitaIva) {
		PartitaIva = partitaIva;
	}

	public void setDipendenti(int dipendenti) {
		Dipendenti = dipendenti;
	}

	@Override
	public String toString() {
		return super.getTipo() + "\t" + super.getID() + "\t" + "\t-\t-\t" + getRagioneSociale() + "\t" + "\t"
				+ getPartitaIva() + "\t" + getDipendenti() + "\t" + getIBAN() + "\t" + super.getIndirizzo();
	}

}
