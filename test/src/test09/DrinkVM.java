package test09;

public class DrinkVM implements VendingMachine{
	
private String product;
	
	@Override
	public void insertCoin(int coin) {
		System.out.println(coin + "���� �����ϴ�.");
	}

	@Override
	public String getProduct() {
		return product;
	}

	@Override
	public void insertProduct(String product) {
		this.product=product;
	}

}
