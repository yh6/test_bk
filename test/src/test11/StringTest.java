package test11;

import java.util.ArrayList;

public class StringTest {

	public String test() {
		String str = new String("��Ʈ���Դϴ�.");
		return str;
	}
	public void test1() {
		String str = new String("��Ʈ���Դϴ�.");
	}
	
	public static void main(String[] agrs) {
		StringTest st = new StringTest();
		String str = st.test();
		System.out.println(str);
		ArrayList<User> userList = new ArrayList<User>();
		for(int i=0;i<3;i++) {	
			User u = new User();
			u.setAge(i);
			u.setDepart(i + "��° �μ��̸�");
			u.setName("�̸� : " + i);
			userList.add(u);
		}
		System.out.println(userList);
	}
}
