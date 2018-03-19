package test11;

import java.util.HashMap;
import java.util.ArrayList;

public class test {
	
	public static void main(String[] agrs) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("부서", "개발팀");
		hm.put("이름", "김개발");
		hm.put("직급", "사원");
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("부서", "디자인팀");
		hm1.put("이름", "김디자");
		hm1.put("직급", "대리");
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("부서", "인사팀");
		hm2.put("이름", "김인사");
		hm2.put("직급", "과장");
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		al.add(hm);
		al.add(hm1);
		al.add(hm2);
		/*ArrayList al = new ArrayList();
		al.add(1);
		al.add("test");
		al.add(hm);*/
		int cnt=1;
		for(HashMap<String,String> hm3 : al) { // foreach문
			System.out.println((cnt++) + ":" + hm3);  //증감연산자 (앞에 잇으면-계산을 하고 / 출력 뒤에 잇으면-계산을 하고 출력)
		/*	int a = 1;
			System.out.println(a++);
			System.out.println(a); *///a++ 계산을 하고 출력되기때문에 1에서 출력에 대서2가 됨 
		}
	//	System.out.println(al);
		User u = new User();
		u.setAge(33);
		u.setDepart("개발팀");
		u.setName("길동이");
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u);
		for(int i=0;i<userList.size();i++) {
			User user = userList.get(i);
			System.out.println(user);
		}
	}

}
