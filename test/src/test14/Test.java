package test14;

class Exam{
	String text;
	public void print() {
		System.out.println("�̳�Ŭ������ �Լ� ȣ��");
	}
}
public class Test {
		
	Exam e ; //new ������ �Ⱦѱ� ������ null ����.
	
	public static void main(String[] args) {
		Test t = new Test(); //�ּҰ� ����
		//t.e = new Exam();
		System.out.println(t.e); 
		
		Exam[] eArr = new Exam[3];
		System.out.println(eArr[0]); //Exam[0]�� new ������ ���ޱ� ������ null ����. ==�񱳴� �ּҺ�
	}
	
}
