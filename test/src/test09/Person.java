package test09;

public class Person implements Action{

	@Override
	public void eat() {
		System.out.println("����� ���� �Խ��ϴ�.");
	}

	@Override
	public void walk() {	
		System.out.println("����� �Ƚ��ϴ�.");
	}

	@Override
	public void see() {
		System.out.println("����� ���ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}

	public static void main(String[] agrs) {
		Object o = new Person();
		Person p = new Person();
		Action a = new Person();
		Action a1 = new Animal();
		a.eat();
		a1.eat();
	}
}
