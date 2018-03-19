package test11;

import java.util.ArrayList;

public class StringTest {

	public String test() {
		String str = new String("스트링입니다.");
		return str;
	}
	public void test1() {
		String str = new String("스트링입니다.");
	}
	
	public static void main(String[] agrs) {
		StringTest st = new StringTest();
		String str = st.test();
		System.out.println(str);
		ArrayList<User> userList = new ArrayList<User>();
		for(int i=0;i<3;i++) {	
			User u = new User();
			u.setAge(i);
			u.setDepart(i + "번째 부서이름");
			u.setName("이름 : " + i);
			userList.add(u);
		}
		System.out.println(userList);
	}
}
