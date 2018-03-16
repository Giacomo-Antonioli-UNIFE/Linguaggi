package Esercizio;

public class Automobile extends Veicolo {
	private String targa;
	private boolean avviata;

	// il costruttore imposta la targe vel e acc a 0 e avviata a false,
	public Automobile(String targa) {
		super();
		this.targa = targa;
		this.avviata = false;
	}

	// settano opportunamente l’attributo avviata
	public void avvia() {
		avviata = true;
	}

	public void spegni() {
		avviata = false;
	}

	// accelera controlla se la macchina è avviata, nel qual caso setta i nuovi
	// valori di accelerazione e velocità (vel. precedente + acc*sec),
	// altrimenti manda un messaggio d’errore
	public void accelera(double accelerazione, int secondi) {
		if (avviata) {
			super.setAccelerazione((double)accelerazione);
			double lavoro = super.getVelocita();
			super.setVelocita((double)(lavoro + accelerazione * secondi));
		}
	}
}
