
public class Privato extends Clienti {
	protected String NameSurname,CodeFisc;



	public Privato(String type, String address, int code, String nameSurname, String codeFisc) {
		super(type, address, code);
		NameSurname = nameSurname;
		CodeFisc = codeFisc;
	}



	public String getNameSurname() {
		return NameSurname;
	}



	public String getCodeFisc() {
		return CodeFisc;
	}

	public String getName()
	{
		return NameSurname;
	}
	public String getFisc() {
		return CodeFisc;
		}

	public void setNameSurname(String nameSurname) {
		NameSurname = nameSurname;
	}



	public void setCodeFisc(String codeFisc) {
		CodeFisc = codeFisc;
	}



	@Override
	public String toString() {
		return "Privato [NameSurname=" + NameSurname + ", CodeFisc=" + CodeFisc + ", Type=" + Type + ", Address="
				+ Address + ", Code=" + Code + "]";
	}

	
	
}
