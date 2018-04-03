package test19;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
	private DBCon dbcon;
	private Scanner scan;
	public UserController() {
		try {
			dbcon = new DBCon("dbcon.properties");
			scan = new Scanner(System.in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertUser() {
		System.out.println("���������� �Է����ּ���");
		System.out.println("��ȣ: ");
		String num = scan.nextLine();
		System.out.println("����: ");
		String age = scan.nextLine();
		System.out.println("�ּ�: ");
		String address = scan.nextLine();
		System.out.println("�̸�: ");
		String name = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		map.put("age", age);
		map.put("address", address);
		map.put("name", name);
	
		int result = dbcon.insert(map);
		if(result ==0) {
			System.out.println("���������� ����");
		}else {
			System.out.println("������ ����");
		}
	}
	
	public void printUserList(String name) {
		List<Map<String,String>> list = dbcon.select();
		for(Map<String,String> map:list) {
			System.out.println(map);
		}
		System.out.println("��µ� ��������Ʈ�� �� ������: " + list.size());
	}
	public void delete() {
		System.out.println("������ ������ȣ�� �����ּ���");
		String num = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		int result = dbcon.delete(map);
		if(result==0) {
			System.out.println("��������");
		}else {
			System.out.println("��������");
		}
	}
	public static void main(String[] agrs) {
		UserController 	uc = new UserController();
		System.out.println("���Ͻô� ��ȣ�� �Է��ϼ���");
		System.out.println("0:�������,2:��������,3:��������,4:��������Ʈ,q:����");
		Scanner scan = new Scanner(System.in);
		while(true) {
			String op = scan.nextLine();
			if("q".equals(op)) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}else if("0".equals(op)) {
				uc.insertUser();
			}else if("4".equals(op)) {
				uc.printUserList("");
			}else if("2".equals(op)) {
				uc.delete();
			}else {
				System.out.println("���������غ����Դϴ�. �ٽ� �Է����ּ���");
				
		}
	//	uc.insertUser();
	}
}
}