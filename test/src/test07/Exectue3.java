package test07;

public class Exectue3 {
	public static void main(String[] agrs) {
		//Food.FOOD_NAME="�ܱ�����";  final(����� ������ ����;Ȯ��no-Ŭ������ �پ�����)�� �Ἥ ���Ҽ� ���� ���̱� ������ �ȵ� =>���(������ �پ�����)
		Food f = new Pizza();
		System.out.println(f.FOOD_NAME);
		Food f1 = new Lamen();
		System.out.println(f1.FOOD_NAME);
		System.out.println(Food.FOOD_NAME);
	}
}
