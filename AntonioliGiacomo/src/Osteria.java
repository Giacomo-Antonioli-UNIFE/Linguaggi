public class Osteria extends Ristorante {
	protected int Posti;
	protected double Metri;
	protected boolean BagnoDisabili;

	public Osteria(int iD, String tipo, String nome, int posti, double metri,
			boolean bagnoDisabili) {
		super(iD, tipo, nome);
		Posti = posti;
		Metri = metri;
		BagnoDisabili = bagnoDisabili;
	}

	public int getPosti() {
		return Posti;
	}

	public void setPosti(int posti) {
		Posti = posti;
	}

	public double getMetri() {
		return Metri;
	}

	public void setMetri(double metri) {
		Metri = metri;
	}

	public boolean isBagnoDisabili() {
		return BagnoDisabili;
	}

	public void setBagnoDisabili(boolean bagnoDisabili) {
		BagnoDisabili = bagnoDisabili;
	}

	@Override
	public String toString() {
		return Nome + "\t" + ID + "\t" + Tipo + "\t-\t-" + Posti + "\t" + Metri
				+ "\t" + BagnoDisabili;
	}

}
