package test09;

public class Animal implements Action{
	
	@Override
	public void eat() {
		System.out.println("동물이 밥을 먹습니다.");
	}

	@Override
	public void walk() {	
		System.out.println("동물이 걷습니다.");
	}

	@Override
	public void see() {
		System.out.println("동물이 봅니다.");
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
	//인터페이스를 구현받으면 오버라이딩(재정의)를 해줘야함
	
}
