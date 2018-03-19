/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Werewolf extends Personaggio implements Fight, Bite {

	protected int Strenght;
	protected boolean human = true;

	public boolean getType() {
		return human;
	}

	public Werewolf(boolean moon) {
		if (moon) {
			this.Strenght = 15;
			setType(!moon);
		}

		else {
			this.Strenght = 10;
			setType(moon);
		}
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

	public void reduceStrenghtFight() {
		this.Strenght = this.Strenght - 3;
	}

	public void reduceStrenghtBite() {
		this.Strenght = this.Strenght - 2;
	}

	public void Attack() {
		if (human)
			this.reduceStrenghtFight();
		else
			this.reduceStrenghtBite();
	}

	public void StampaForza() {
		System.out.println(getStrenght());
	}
}
