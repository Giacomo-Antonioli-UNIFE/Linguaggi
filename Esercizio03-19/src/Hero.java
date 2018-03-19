/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Hero extends Personaggio implements Fight {

	protected int Strenght;
	protected boolean human = true;

	public boolean getType() {
		return human;
	}

	public Hero() {
		this.Strenght = 10;
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

	public void Attack() {
		this.reduceStrenghtFight();
	}

	public void StampaForza() {
		System.out.println(getStrenght());
	}
}