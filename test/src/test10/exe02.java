package test10;

import java.util.ArrayList;

public class exe02 {

	// strList 1���� 10���� ���� ���ڷ� =>�׸��� ���� ���ϼ���
	public static void main(String[] agrs) {
		ArrayList<String> strList = new ArrayList<String>();
		for(int i=1;i<11;i++) {
			strList.add(i+"");
		}
		int sum = 0;
		for(int i=0;i<strList.size();i++) {
			sum += Integer.parseInt(strList.get(i));
		}
		System.out.println(sum);
	}
}

