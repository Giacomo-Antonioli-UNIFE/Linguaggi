
public class Pallavolo extends Squadra {
	protected float MediaSetVinti;

	public Pallavolo(int Partitevinte, int Partiteperse, int Codice, String Nome, String Sport, float MediaSetVinti) {
		super(Partitevinte, Partiteperse, Codice, Nome, Sport);
		// TODO Auto-generated constructor stub
		this.MediaSetVinti = MediaSetVinti;

	}

	/**
	 * @return the mediaSetVinti
	 */
	public float getMediaSetVinti() {
		return MediaSetVinti;
	}

	/**
	 * @param mediaSetVinti
	 *            the mediaSetVinti to set
	 */
	public void setMediaSetVinti(float mediaSetVinti) {
		MediaSetVinti = mediaSetVinti;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Nome + "\t" + Codice + "\t" + Partitevinte + "\t" + Partiteperse + "\t-\t" + MediaSetVinti + "\t"
				+ Sport;
	}

}
