package test10;

import java.util.ArrayList;

public class exe02 {

	// strList 1부터 10까지 저장 문자로 =>그리고 합을 구하세요
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

