package test11;

import java.util.HashMap;
import java.util.ArrayList;

public class MapTest {
	
	public static void main(String[] agrs) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("�̸�", "ȫ�浿");
		hm.put("�ּ�","��⵵");
		hm.put("����","22");
		hm.put("����","33");
		//hm.put("���� ","44"); // �������
		System.out.print(hm.get("����"=="����"));
		
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("�̸�", "��浿");
		hm1.put("�ּ�","���ֵ�");
		hm1.put("����","30");
		
	/*	System.out.println(hm.get("�̸�"));
		System.out.println(hm.get("�ּ�"));
		System.out.println(hm.get("����")); */ //������ null , �����̽�(���ڿ�) "����"=="���� " false ,�ڹٴ� ��ҹ��� ����
		
		/*String[][] strArr = new String[4][3];  //�տ��� �ο� , �ڿ��� ��Ÿ����Ÿ-�����
		strArr[0][0] = "ȫ�浿";
		strArr[0][1] = "22";
		strArr[0][2] = "������";
		
		strArr[0][0] = "��浿";
		strArr[0][1] = "23";
		strArr[0][2] = "���ֵ�";*/
		
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		al.add(hm);
		al.add(hm1); // [{},{}]
		//	System.out.println(al.get(0).get("�ּ�"));
		for(int i=0;i<al.size();i++) {
			HashMap hashmap = new HashMap();
			hashmap= al.get(i);
			
			System.out.println(hashmap.get("�̸�"));
			System.out.println(hashmap.get("����"));
			System.out.println(hashmap.get("�ּ�"));
		}
	}

}
