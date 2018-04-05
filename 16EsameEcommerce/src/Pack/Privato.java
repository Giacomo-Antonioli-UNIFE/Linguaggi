package Pack;

public class Privato extends Cliente {
	protected String Nome, NumeroCarta;

	public Privato(int iD, String tipo, String indirizzo, String nome, String numeroCarta) {
		super(iD, tipo, indirizzo);
		Nome = nome;
		NumeroCarta = numeroCarta;
	}

	public String getNome() {
		return Nome;
	}

	public String getNumeroCarta() {
		return NumeroCarta;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public void setNumeroCarta(String numeroCarta) {
		NumeroCarta = numeroCarta;
	}

	@Override
	public String toString() {

		return super.getTipo() + "\t" + super.getID() + "\t" + Nome + "\t" + NumeroCarta + "\t-\t-\t-\t-\t"
				+ super.getIndirizzo();
	}

}
