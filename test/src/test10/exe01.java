package test10;

import java.util.ArrayList;

public class exe01 {
	
	public static void main(String[] agrs) {
		//1���� 10���� al�� ���� ���ϰ� al�� ������ �ִ� ��簪�� ���� ���Ͻÿ�	
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
