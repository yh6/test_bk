package test07;

public class Execute2 {
	
	static int a=3;
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int getNum() { //static 호출가능
		return 3;
	}
	public static void main(String[] agrs) {
		
	//	e2.add(1, 2);
	//	e2.getNum();
		getNum();
		a=4;
		Execute2.a = 5;
		Execute2 e2 = new Execute2();
		
	}

}
