package test09;

import java.util.Scanner;

public class NumException {
	public static int getNumber() { 
		Scanner scn = new Scanner("대한민국\n우리나라\n");
		System.out.println("숫자를 입력해주세요");
		String num = scn.nextLine();
		int a = 0;
		try {
			a = Integer.parseInt(num);
		}catch(Exception e){
			System.out.println("숫자를 입력해주세요");
			a = getNumber(); //재귀호출 (나자신을 호출 -반복)
		}
		return a; 
	}
	public static void main(String[] agrs) {
		int number = getNumber();
		System.out.println("입력하신 숫자는" + number + "입니다.");
	}
/*	int b =1; 
	while(b<10) {
		System.out.println(b);
		b++; <= 없으면 무한로프
		break; while문을 나감 종료
	} 함수를 호출해서 나갈려면 리턴을 쓰면됨*/
	
}
