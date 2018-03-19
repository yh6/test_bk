package test10;

import java.util.ArrayList;

public class ListExam01 {
	public static void main(String[] agrs) {
		ArrayList<Integer> al = new ArrayList<Integer>();  //<>add할때 데이터타입설정
		for(int i=0;i<=10;i++) {
			al.add(i); // 방을 추가 됨
		}
	//	System.out.println(al.get(0));  //add는 추가 get는 방의 값을 가져올때 
	//1부터 10까지 al의 값을 구하고 al이 가지고 있는 모든값의 합을 구하시요	
		int sum = 0;		
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
			
		}
		System.out.println(sum);
	}
}
