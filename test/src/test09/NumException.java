package test09;

import java.util.Scanner;

public class NumException {
	public static int getNumber() { 
		Scanner scn = new Scanner("���ѹα�\n�츮����\n");
		System.out.println("���ڸ� �Է����ּ���");
		String num = scn.nextLine();
		int a = 0;
		try {
			a = Integer.parseInt(num);
		}catch(Exception e){
			System.out.println("���ڸ� �Է����ּ���");
			a = getNumber(); //���ȣ�� (���ڽ��� ȣ�� -�ݺ�)
		}
		return a; 
	}
	public static void main(String[] agrs) {
		int number = getNumber();
		System.out.println("�Է��Ͻ� ���ڴ�" + number + "�Դϴ�.");
	}
/*	int b =1; 
	while(b<10) {
		System.out.println(b);
		b++; <= ������ ���ѷ���
		break; while���� ���� ����
	} �Լ��� ȣ���ؼ� �������� ������ �����*/
	
}
