package test09;

public class ExceptionExam {

	public static void main(String[] agrs) {
		int a = 1;
		String s = "1a";
		try {
			int b = Integer.parseInt(s);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}
		System.out.println(a);
		System.out.println("프로그램이 정상적으로 종료 하였습니다.");
	}

}
