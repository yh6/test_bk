package test09;

public class Animal implements Action{
	
	@Override
	public void eat() {
		System.out.println("������ ���� �Խ��ϴ�.");
	}

	@Override
	public void walk() {	
		System.out.println("������ �Ƚ��ϴ�.");
	}

	@Override
	public void see() {
		System.out.println("������ ���ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("������ ���� ��ϴ�.");
	}
	//�������̽��� ���������� �������̵�(������)�� �������
	
}
