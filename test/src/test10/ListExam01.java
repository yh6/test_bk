package test10;

import java.util.ArrayList;

public class ListExam01 {
	public static void main(String[] agrs) {
		ArrayList<Integer> al = new ArrayList<Integer>();  //<>add�Ҷ� ������Ÿ�Լ���
		for(int i=0;i<=10;i++) {
			al.add(i); // ���� �߰� ��
		}
	//	System.out.println(al.get(0));  //add�� �߰� get�� ���� ���� �����ö� 
	//1���� 10���� al�� ���� ���ϰ� al�� ������ �ִ� ��簪�� ���� ���Ͻÿ�	
		int sum = 0;		
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
			
		}
		System.out.println(sum);
	}
}
