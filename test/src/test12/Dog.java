package test12;

public class Dog {
	
	private String name;
	private int age;
	private String kind;
	
	public Dog() {
		
	}
	public Dog(String name, int age, String kind) {  //������
		this.name=name;
		this.age=age;
		this.kind=kind;
	}
	public void back() {
		System.out.println(name + "�� ¢���ϴ�.");
	}
	
	public void run() {
		System.out.println(name + "�� �޸��ϴ�.");
	}
	public String toString() {
		return kind + "���̰�,�̸���:" + name + "�̰�," + "���̴� " + age + "�� �Դϴ�.";
	}
}
