package test09;

public class Excetue {
	
	
	public static void main(String[] agrs) {
		
		DrinkVM dvm = new DrinkVM();
		dvm.insertProduct("��ī�ݶ�330ml");
		dvm.insertCoin(300);
		String item = dvm.getProduct();
		System.out.println("���� ��ǰ�� : " + item);
		
	}

}
