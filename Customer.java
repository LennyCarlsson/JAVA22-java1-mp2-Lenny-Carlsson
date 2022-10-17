package ShoppingApp;

class Customer {

	private int purchasedGoods = 0;
	private double sumOfGoods = 0;

	public int getPurchasedGoods() {

		return purchasedGoods;

	}

	public void setPurchasedGoods() {
		purchasedGoods++;
	}

	public double getSumOfGoods() {

		return sumOfGoods;

	}

	public void setSumOfGoods(double toAdd) {

		sumOfGoods += toAdd;
	}

}
