package test09;

import java.util.Scanner;

public class ExceptionExam2 {

	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in); //���� �Է¹����� 
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		String num1 = s.nextLine();
		int n1 = 0;
		int n2 = 0;
		try {
			n1 = Integer.parseInt(num1);
		} catch (Exception e) {
			System.out.println("ù��° ���ڰ� �ƴմϴ�.");
		}
		System.out.println("�ι�° ���ڸ� �Է����ּ��� ");
		String num2 = s.nextLine();
		try {
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			System.out.println("�ι�° ���ڰ� �ƴմϴ�.");
		}
		
		System.out.println(num1 + "+" + num2 + "=" + (n1 + n2));
		
		/*String str;
		str = s.next(); hello java�Է½� hello�� ���
		System.out.println(s);
		
		str = s.nextLine(); hello java �� ���
		System.out.println(s);*/
	}
	
	
}
