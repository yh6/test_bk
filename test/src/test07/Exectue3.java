package test07;

public class Exectue3 {
	public static void main(String[] agrs) {
		//Food.FOOD_NAME="외국음식";  final(상속을 받을수 없음;확장no-클래스에 붙엇을때)를 써서 변할수 없는 값이기 때문에 안됨 =>상수(변수에 붙엇을때)
		Food f = new Pizza();
		System.out.println(f.FOOD_NAME);
		Food f1 = new Lamen();
		System.out.println(f1.FOOD_NAME);
		System.out.println(Food.FOOD_NAME);
	}
}
