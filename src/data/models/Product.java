package data.models;

public class Product {
	private String name;
	private String description;
	private String typ;
	private String price;
	public Product (String name, String description, String typ, String price) {
		this.name = name;
		this.description = description;
		this.typ = typ;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTyp() {
		return typ;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.name + "," + this.description + "," + this.typ + "," + this.price;
	}
}
