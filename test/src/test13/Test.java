package test13;

public class Test {

	String text;
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] agrs) {
		Test t = new Test();
		t.text = "난 t꺼야";
		System.out.println(t.text); //t.메모리주소를 갖고잇어서 -메모리주소 찍힘
		
		Test[] tArr = new Test[3]; //방3개가 만들어짐 모든방에 null값을 가짐
		//System.out.println(tArr[0].text); //null exception오류 - (방번호만 호출해야지 null나옴)
		tArr[0] = new Test();
		System.out.println(tArr[0].text);
		Test t1 = tArr[0]; //데이터타입이 같기때문에 가능
	}
}
