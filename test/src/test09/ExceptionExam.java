package test09;

public class ExceptionExam {

	public static void main(String[] agrs) {
		int a = 1;
		String s = "1a";
		try {
			int b = Integer.parseInt(s);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		System.out.println(a);
		System.out.println("���α׷��� ���������� ���� �Ͽ����ϴ�.");
	}

}
