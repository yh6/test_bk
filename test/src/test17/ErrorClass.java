package test17;

import java.util.ArrayList;
import java.util.List;

public class ErrorClass {
	
	static void prinList(List<String>al) throws Exception {
		try {
		for(int i=0;i<3;i++) {
			System.out.println(al.get(1));
		}
		}catch(Exception e) {
			throw new Exception ("에러난 메세지");
		}
	}
	public static void main(String[] agrs) {
		System.out.println("리스트 프로그램 시작");
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		try {
			prinList(al);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("에러:" + e.getMessage());
		}
		System.out.println("리스트 프로그램 종료");
		}
		
	}

