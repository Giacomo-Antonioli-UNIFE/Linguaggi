/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public class Individuo extends Iscritto {

	protected String Name,Surname;

	/**
	 * @param type
	 * @param address
	 * @param account
	 * @param password
	 * @param iD
	 * @param name
	 * @param surname
	 */
	public Individuo(String type, String address, String account, String password, int iD, String name,
			String surname) {
		super(type, address, account, password, iD);
		Name = name;
		Surname = surname;
	}

	/**
	 * @return the name
	 */
	public String getNome() {
		return Name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return Surname;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		Surname = surname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Individuo [Name=" + Name + ", Surname=" + Surname + ", Type=" + Type + ", Address=" + Address
				+ ", Account=" + Account + ", Password=" + Password + ", ID=" + ID + ", Seguace=" + Seguace.size() + "]";
	}
	
	
}
