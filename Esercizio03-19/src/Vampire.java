
public class Vampire extends Personaggio implements Bite {
	protected int Strenght;
	protected boolean human = false;

	public boolean getType() {
		return human;
	}

	public Vampire() {
		this.Strenght = 15;
	}

	public int getStrenght() {
		return Strenght;
	}

	public void setType(boolean type) {
		this.human = type;

	}

	public void setStrenght(int Strenght) {
		this.Strenght = Strenght;

	}

	public void reduceStrenghtBite() {
		this.Strenght = this.Strenght - 2;
	}

	public void Attack() {
		this.reduceStrenghtBite();
	}

	public void StampaForza() {
		System.out.println(getStrenght());
	}
}
