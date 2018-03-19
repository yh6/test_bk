package test07;

public class BIZMan extends Person {
	public BIZMan(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void doWork() {
		System.out.println(name + "님이 말을 합니다.");
	}
}
