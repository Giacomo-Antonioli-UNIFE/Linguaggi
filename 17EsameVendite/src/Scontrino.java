import java.util.*;

public class Scontrino {
	protected Clienti Buyer;
	protected int Code, Day, Month, Year;
	List<Prodotto> Items = new LinkedList<Prodotto>();

	public Scontrino(Clienti buyer, int code, int day, int month, int year, List<Prodotto> Items) {
		Buyer = buyer;
		Code = code;
		Day = day;
		Month = month;
		Year = year;
		this.Items = Items;
	}

	public Clienti getBuyer() {
		return Buyer;
	}

	public int getCode() {
		return Code;
	}

	public int getDay() {
		return Day;
	}

	public int getMonth() {
		return Month;
	}

	public int getYear() {
		return Year;
	}

	public List<Prodotto> getItems() {
		return Items;
	}

	public void setBuyer(Clienti buyer) {
		Buyer = buyer;
	}

	public void setCode(int code) {
		Code = code;
	}

	public void setDay(int day) {
		Day = day;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public void setYear(int year) {
		Year = year;
	}

	public void setItems(Prodotto item) {
		Items.add(item);
	}

	@Override
	public String toString() {
		return "Scontrino [Buyer=" + Buyer + ", Code=" + Code + ", Day=" + Day + ", Month=" + Month + ", Year=" + Year
				+ ", Items=" + Items + "]";
	}

}
