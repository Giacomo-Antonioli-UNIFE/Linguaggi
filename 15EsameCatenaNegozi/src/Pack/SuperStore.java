package Pack;

public class SuperStore extends Negozio {
	protected String RagioneSociale;
	protected int PartitaIva, Casse;

	public SuperStore(int iD, int superfice, String tipo, String indirizzo, String ragioneSociale, int partitaIva,
			int casse) {
		super(iD, superfice, tipo, indirizzo);
		RagioneSociale = ragioneSociale;
		PartitaIva = partitaIva;
		Casse = casse;
	}

	public String getRagioneSociale() {
		return RagioneSociale;
	}

	public int getPartitaIva() {
		return PartitaIva;
	}

	public int getCasse() {
		return Casse;
	}

	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	public void setPartitaIva(int partitaIva) {
		PartitaIva = partitaIva;
	}

	public void setCasse(int casse) {
		Casse = casse;
	}

	@Override
	public String toString() {
		return "SuperStore [RagioneSociale=" + RagioneSociale + ", PartitaIva=" + PartitaIva + ", Casse=" + Casse
				+ ", ID=" + ID + ", Superfice=" + Superfice + ", Tipo=" + Tipo + ", Indirizzo=" + Indirizzo + "]";
	}

}
