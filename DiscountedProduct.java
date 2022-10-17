package ShoppingApp;

class DiscountedProduct extends Product {

	private double price = 0;
	final double discount = 0.80;

	public DiscountedProduct(String name, double price, int inStock) {

		super(name, inStock);		
		this.price = price * discount;

	}

	public String getName() {
		
		return super.getName();

	}

	public int getInStock() {
		
		return super.getInstock();

	}
	
	public void setInstock() {
		
		super.setInStock();
	}

	public double getPrice() {
		
		return price;
	}

}
