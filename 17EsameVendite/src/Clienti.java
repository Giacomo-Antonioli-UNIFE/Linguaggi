/**
 * 
 */

/**
 * @author Giacomo
 *
 */
public abstract class Clienti {

	protected String Type, Address;
	protected int Code;

	public Clienti(String type, String address, int code) {
		Type = type;
		Address = address;
		Code = code;
	}

	/**
	 * @param type
	 * @param address
	 */

	/**
	 * @return the type
	 */
	public String getType() {
		return Type;
	}

	public int getCode() {
		return Code;
	}
	public String getName() {
	return"";
	}
	public int getIva() {
		return 0;
		}
	public String getFisc() {
		return"";
		}
	public void setCode(int code) {
		Code = code;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		Type = type;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

}
