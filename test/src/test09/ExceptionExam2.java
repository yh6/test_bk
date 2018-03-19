package test09;

import java.util.Scanner;

public class ExceptionExam2 {

	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in); //값을 입력받을때 
		System.out.println("첫번째 숫자를 입력해주세요");
		String num1 = s.nextLine();
		int n1 = 0;
		int n2 = 0;
		try {
			n1 = Integer.parseInt(num1);
		} catch (Exception e) {
			System.out.println("첫번째 숫자가 아닙니다.");
		}
		System.out.println("두번째 숫자를 입력해주세요 ");
		String num2 = s.nextLine();
		try {
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			System.out.println("두번째 숫자가 아닙니다.");
		}
		
		System.out.println(num1 + "+" + num2 + "=" + (n1 + n2));
		
		/*String str;
		str = s.next(); hello java입력시 hello만 출력
		System.out.println(s);
		
		str = s.nextLine(); hello java 다 출력
		System.out.println(s);*/
	}
	
	
}
