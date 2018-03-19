package test10;

import java.util.ArrayList;

public class exe01 {
	
	public static void main(String[] agrs) {
		//1부터 10까지 al의 값을 구하고 al이 가지고 있는 모든값의 합을 구하시요	
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<11;i++) {
			al.add(i);
		}
		int sum =0;
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
		}
		System.out.println(sum);
	}

}
