package test11;

import java.util.HashMap;
import java.util.ArrayList;

public class test {
	
	public static void main(String[] agrs) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("�μ�", "������");
		hm.put("�̸�", "�谳��");
		hm.put("����", "���");
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("�μ�", "��������");
		hm1.put("�̸�", "�����");
		hm1.put("����", "�븮");
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("�μ�", "�λ���");
		hm2.put("�̸�", "���λ�");
		hm2.put("����", "����");
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		al.add(hm);
		al.add(hm1);
		al.add(hm2);
		/*ArrayList al = new ArrayList();
		al.add(1);
		al.add("test");
		al.add(hm);*/
		int cnt=1;
		for(HashMap<String,String> hm3 : al) { // foreach��
			System.out.println((cnt++) + ":" + hm3);  //���������� (�տ� ������-����� �ϰ� / ��� �ڿ� ������-����� �ϰ� ���)
		/*	int a = 1;
			System.out.println(a++);
			System.out.println(a); *///a++ ����� �ϰ� ��µǱ⶧���� 1���� ��¿� �뼭2�� �� 
		}
	//	System.out.println(al);
		User u = new User();
		u.setAge(33);
		u.setDepart("������");
		u.setName("�浿��");
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u);
		for(int i=0;i<userList.size();i++) {
			User user = userList.get(i);
			System.out.println(user);
		}
	}

}
