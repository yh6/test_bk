package test13;

import java.util.ArrayList;

public class Excute {
	
	public static void main(String[] agrs) {
		ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
		UserInfo ui = new UserInfo();
		
		for(int i=0;i<3;i++) {		
			ui.setName("�̸� :" + i);
			ui.setAge(i);
			ui.setAddress("�ּ�:" +i);
			ui.setNum(i);
			userList.add(ui); 
		}
		for(UserInfo ui1:userList) {
		System.out.println(ui1);  
		} //String ��  str.equals("");
	}
}
