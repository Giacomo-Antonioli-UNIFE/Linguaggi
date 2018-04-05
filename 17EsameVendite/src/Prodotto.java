
public class Prodotto {
protected String Description;
protected int Quantity,Price;
public Prodotto(String description, int quantity, int price) {
	Description = description;
	Quantity = quantity;
	Price = price;
}
public String getDescription() {
	return Description;
}
public int getQuantity() {
	return Quantity;
}
public int getPrice() {
	return Price;
}
public void setDescription(String description) {
	Description = description;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public void setPrice(int price) {
	Price = price;
}
@Override
public String toString() {
	return "Prodotto [Description=" + Description + ", Quantity=" + Quantity + ", Price=" + Price + "]";
}

}
