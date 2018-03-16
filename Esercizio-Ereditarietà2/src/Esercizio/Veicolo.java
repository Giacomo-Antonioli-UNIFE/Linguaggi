package Esercizio;

public class Veicolo {
	private double velocita;
	private double accelerazione;

	// Costruttori
	public Veicolo() {
		velocita = 0;
		accelerazione = 0;
	} // inizializza a 0 gli attributi

	public Veicolo(double velocita, double accelerazione) {
		this.velocita = velocita;
		this.accelerazione = accelerazione;
	}

	// GETTERS
	public double getVelocita() {
		return velocita;
	}

	public double getAccelerazione() {
		return accelerazione;
	}

	// SETTERS
	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}

	public void setAccelerazione(double accelerazione) {
		this.accelerazione = accelerazione;
	}

	// stampa la velocità di un oggetto di classe VEICOLO
	static public void printVelocita(Veicolo v) {
		System.out.println("La velocità è: " + v.velocita);
	}
}
