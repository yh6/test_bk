package test07;

public class Dog  extends Animal{
	public Dog(String type, String name, int age) {
		this.type=type;
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println(type + "�������� ��Ḧ �Խ��ϴ�.");
	}

}
