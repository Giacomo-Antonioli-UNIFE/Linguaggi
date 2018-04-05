package Pack;

public class CityStore extends Negozio {
	protected String NomeCognome, CodiceFiscale;

	public CityStore(int iD, int superfice, String tipo, String indirizzo, String nomeCognome, String codiceFiscale) {
		super(iD, superfice, tipo, indirizzo);
		NomeCognome = nomeCognome;
		CodiceFiscale = codiceFiscale;
	}

	public String getNomeCognome() {
		return NomeCognome;
	}

	public String getCodiceFiscale() {
		return CodiceFiscale;
	}

	public void setNomeCognome(String nomeCognome) {
		NomeCognome = nomeCognome;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return "CityStore [NomeCognome=" + NomeCognome + ", CodiceFiscale=" + CodiceFiscale + ", ID=" + ID
				+ ", Superfice=" + Superfice + ", Tipo=" + Tipo + ", Indirizzo=" + Indirizzo + "]";
	}
}
