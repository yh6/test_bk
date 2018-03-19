package test11;

import java.util.HashMap;
import java.util.ArrayList;

public class MapTest {
	
	public static void main(String[] agrs) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("이름", "홍길동");
		hm.put("주소","경기도");
		hm.put("나이","22");
		hm.put("나이","33");
		//hm.put("나이 ","44"); // 덮어쓰여짐
		System.out.print(hm.get("나이"=="나이"));
		
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("이름", "김길동");
		hm1.put("주소","제주도");
		hm1.put("나이","30");
		
	/*	System.out.println(hm.get("이름"));
		System.out.println(hm.get("주소"));
		System.out.println(hm.get("나이")); */ //없으면 null , 스페이스(빈문자열) "나이"=="나이 " false ,자바는 대소문자 구별
		
		/*String[][] strArr = new String[4][3];  //앞에가 로우 , 뒤에는 메타데이타-밸류값
		strArr[0][0] = "홍길동";
		strArr[0][1] = "22";
		strArr[0][2] = "강원도";
		
		strArr[0][0] = "김길동";
		strArr[0][1] = "23";
		strArr[0][2] = "제주도";*/
		
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		al.add(hm);
		al.add(hm1); // [{},{}]
		//	System.out.println(al.get(0).get("주소"));
		for(int i=0;i<al.size();i++) {
			HashMap hashmap = new HashMap();
			hashmap= al.get(i);
			
			System.out.println(hashmap.get("이름"));
			System.out.println(hashmap.get("나이"));
			System.out.println(hashmap.get("주소"));
		}
	}

}
