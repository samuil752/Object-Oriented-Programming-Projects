package model;
/* https://www.youtube.com/watch?v=Z-WU-9vvk9Q&list=PL5dxAmCmjv_6qOF_X4tr_iB5SOnWwD-tx&index=15
 * Template of a unit of storage in the apple refurbished shop.
 * Think of a shop as a collection of entries.
 * */
public class Entry {
	private String serialNumber; //e.g F9FHDSKJA3DH (unique)
	private Product product; //the type of attributr is a reference type, denoting an existing class
	// consequently at the run time, this attribute will store the address of some Product object. 
	
	public Entry(String serialNumber, Product product) {
		// TODO Auto-generated constructor stub
		this.serialNumber = serialNumber;
		this.product = product;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public void setProduct(String model, double originalPrice) {
		//this.product = new Product(model, originalPrice); ((anonymous objects)) can do this also.
		Product p = new Product(model, originalPrice);
		this.product = p;
	}
	
	public String toString() {
		return "["+serialNumber+"] "+product.toString();
	}
	
	
	
}
