
public class Azienda extends Clienti {
	protected String Society;
	protected int Iva;

	public Azienda(String type, String address, int code, String society, int iva) {
		super(type, address, code);
		Society = society;
		Iva = iva;

	}

	public String getSociety() {
		return Society;
	}

	public int getIva() {
		return Iva;
	}

	public String getName()
	{
		return Society;
	}

	
	public void setSociety(String society) {
		Society = society;
	}

	public void setIva(int iva) {
		Iva = iva;
	}

	@Override
	public String toString() {
		return "Azienda [Society=" + Society + ", Iva=" + Iva + ", Type=" + Type + ", Address=" + Address + ", Code="
				+ Code + "]";
	}




}
