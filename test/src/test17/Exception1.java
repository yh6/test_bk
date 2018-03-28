package test17;

public class Exception1 {

	public static void main(String[] agrs) {
		System.out.println("프로그램시작");
		int[] arr = new int[3];
		try {
		arr[3] =3;
		}catch (Exception e) {
			System.out.println("프로그램종료");
		}
	}
}
