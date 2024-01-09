package entities;

import java.io.DataOutput;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		String tag = sb.append(name)
						.append(" $ ")
						.append(price)
						.append(" Customs fee: $ ")
						.append(customsFee).toString();
		return tag;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	
	
	
	

}
