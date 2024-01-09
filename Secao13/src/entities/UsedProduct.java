package entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{

	private LocalDate manufactureDate;
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.manufactureDate = date;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		String tag = sb.append(name)
						.append(" (used) ")
						.append(" $ ")
						.append(price)
						.append(" Manufactured date: $ ")
						.append(manufactureDate).toString();
		return tag;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
}
