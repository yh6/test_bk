package test10;

import java.util.Scanner;

public class ForIf {

	public static void main(String[] agrs) {
		String confirm = "";
		if (confirm.equals("")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("������ ���ΰ���?");
			System.out.println("������ 1 �ƴϸ� 2�� �Է����ּ���");
			confirm = scan.nextLine();
			int menu = 0;
			try {
				menu = Integer.parseInt(confirm);
			} catch (Exception e) {
				System.out.println("������ 1 �ƴϸ� 2�� �Է����ּ���");
			}
			if (menu == 1) {
				System.out.println("���Դϴ�.");
			} else {
				System.out.println("���Դϴ�.");
			}
		}
	}

}
