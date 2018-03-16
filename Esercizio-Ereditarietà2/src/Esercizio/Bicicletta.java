package Esercizio;

public class Bicicletta extends Veicolo {

	public Bicicletta() {
		super();
	}

	public void pedala(int numeroPedalate, int secondi) {
		double accelerazione = ((double)numeroPedalate /(double) (secondi * secondi));
		System.out.println("L'accelerazione è: "+accelerazione);
		super.setAccelerazione(accelerazione);
		double lavoro = super.getVelocita();
		super.setVelocita((double)(lavoro + accelerazione * secondi));
	}

}
