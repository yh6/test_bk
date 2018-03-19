package test09;

public class Excetue {
	
	
	public static void main(String[] agrs) {
		
		DrinkVM dvm = new DrinkVM();
		dvm.insertProduct("코카콜라330ml");
		dvm.insertCoin(300);
		String item = dvm.getProduct();
		System.out.println("뽑은 제품은 : " + item);
		
	}

}
