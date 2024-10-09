package model;

/*
 * Template for individual apple products in the refurbished store.
 */
public class Product {
	/* attributes should be private so that they are only visible only in the current class.
	 * If you indent to make an attribute public, all classes.
	 * Instead, create a public accessor for this private attribute.*/
	private String model; //e.g. ipad pro 12.9
	private String finish; //e.g. SIlver, space grey
	private int storage; //in the units of GB, e.g., 256, 512, 1000 (TB)
	private boolean hasCellularConnectivity; //e.g., false only wifi, true means wifi plus cellular.
	private double discountValue; //e.g, 200.00
	private double originalPrice; //e.g, 1789.00
	
	/* constructs */
	//if no constructor are declared here, an implicit, default constructor is available. As soon as you declare any constructor implicitly that default constructor will not exist anymore.
	public Product () {
		//do nothing: all atributes will be stored in their default values after an object is created.
	}
	//an overloaded version of the constructor.
	public Product(String model, double originalPrice) {
		this.model = model;
		this.originalPrice = originalPrice;
	}
 	
	/* accessors */
	public String getModel() {
		return this.model;
	}
	
	/* mutators */
	public void setModel(String model) {
		this.model = model;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public boolean hasCellularConnectivity() {
		return hasCellularConnectivity;
	}
	public void setHasCellularConnectivity(boolean hasCellularConnectivity) {
		this.hasCellularConnectivity = hasCellularConnectivity;
	}
	public double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	
	public double getPrice() {
		// local variable declarations
		double price = 0.0;
		
		//computation
		price = this.originalPrice - this.discountValue;
		
		//return
		return price;
	}
	public String toString() {
		String s = "";
		s += model + " " + finish + " " + storage + "GB " + "(Cellular connectivity: " + hasCellularConnectivity + "): $(" + String.format("%.2f", originalPrice) + "-" + String.format("%.2f", discountValue) + ")";
		
		return s;
	}

}
