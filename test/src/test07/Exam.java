package test07;

public class Exam {
	public static int a;
	
	public static void main(String[] args) {
		Exam e = new Exam();
		e.a=10;
		System.out.println(e.a);
		
		Exam e1 = new Exam();  //static�̱⶧���� �������� �ٶ󺸱� ������ ���⼭ a�� �ʱ�ȭ�� �ȵǰ� 10�λ��¿��� 4�� �ٲ�
		e1.a=4;
		System.out.println(e.a);
	}

}
