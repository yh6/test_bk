
public class ex02 {

	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static String add2(int num1, int num2) {
		return num1 + "+" +num2+ "=" + (num1+num2);
	}
	public static void main(String[] agrs) {
		add(1,3);
		String result = add2(1,5);
		System.out.println(result);
		String[] strArr = {"월","화","수","목","금","토","일"};
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		System.out.println(strArr.length);
	}
	
}
