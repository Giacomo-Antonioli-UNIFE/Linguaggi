import java.util.*;

/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public abstract class Iscritto {

	protected String Type, Address, Account,Password;
	protected int ID;
	List<Iscritto> Seguace= new LinkedList<Iscritto>();
	/**
	 * @param type
	 * @param address
	 * @param account
	 * @param password
	 * @param iD
	 */
	public Iscritto(String type, String address, String account, String password, int iD) {
		Type = type;
		Address = address;
		Account = account;
		Password = password;
		ID = iD;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return Type;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @return the account
	 */
	public String getAccount() {
		return Account;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		Account = account;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	public  String getNome()
	{
		return "";
	};
	
	
}
