package test12;

import java.util.ArrayList;

// �ڹ�2 å�� �ִ� �÷���- ArrayList,HashMap  / ���׸�-<>Ÿ��
public class Execute {
	
	public static void main(String[] args) {
		
		ArrayList<Dog> dogList = new ArrayList<Dog>(); 
		dogList.add(new Dog("�ǻ�",5,"�����")); //Dog dog = new Dog("ī��1",5,"�����"); dogArr.add(dog);
		dogList.add(new Dog("��",10,"Ǫ��"));
		dogList.add(new Dog("�޸�",3,"��������"));
		dogList.add(new Dog("�ɼ���",7,"����"));
		dogList.add(new Dog("����",1,"�����Ʈ"));
		for(Dog d:dogList) {
			System.out.println(d);
		//new Dog("ī��",5,"�����").back();
		}
		
	}
}
