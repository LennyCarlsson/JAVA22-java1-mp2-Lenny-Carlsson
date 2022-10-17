package ShoppingApp;

class Product {

	private String name;
	private double price;
	private int inStock;

	public Product(String name, double price, int inStock) {

		this.name = name;
		this.price = price;
		this.inStock = inStock;

	}

	public Product(String name, int inStock) {

		this.name = name;
		this.inStock = inStock;

	}

	public String getName() {

		return name;

	}

	public double getPrice() {

		return price;

	}

	public int getInstock() {

		return inStock;

	}

	public void setInStock() {
		
		inStock--;

	}


}
