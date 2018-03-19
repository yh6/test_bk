package test09;

public class Person implements Action{

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}

	@Override
	public void walk() {	
		System.out.println("사람이 걷습니다.");
	}

	@Override
	public void see() {
		System.out.println("사람이 봅니다.");
	}

	@Override
	public void sleep() {
		System.out.println("사람이 잠을 잡니다.");
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
