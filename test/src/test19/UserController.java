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
		System.out.println("유저정보를 입력해주세요");
		System.out.println("번호: ");
		String num = scan.nextLine();
		System.out.println("나이: ");
		String age = scan.nextLine();
		System.out.println("주소: ");
		String address = scan.nextLine();
		System.out.println("이름: ");
		String name = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		map.put("age", age);
		map.put("address", address);
		map.put("name", name);
	
		int result = dbcon.insert(map);
		if(result ==0) {
			System.out.println("정상적으로 저장");
		}else {
			System.out.println("저장이 실패");
		}
	}
	
	public void printUserList(String name) {
		List<Map<String,String>> list = dbcon.select();
		for(Map<String,String> map:list) {
			System.out.println(map);
		}
		System.out.println("출력된 유저리스트의 총 갯수는: " + list.size());
	}
	public void delete() {
		System.out.println("삭제할 유저번호를 적어주세요");
		String num = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		int result = dbcon.delete(map);
		if(result==0) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
	}
	public static void main(String[] agrs) {
		UserController 	uc = new UserController();
		System.out.println("원하시는 번호를 입력하세요");
		System.out.println("0:유저등록,2:유저삭제,3:유저수정,4:유저리스트,q:종료");
		Scanner scan = new Scanner(System.in);
		while(true) {
			String op = scan.nextLine();
			if("q".equals(op)) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}else if("0".equals(op)) {
				uc.insertUser();
			}else if("4".equals(op)) {
				uc.printUserList("");
			}else if("2".equals(op)) {
				uc.delete();
			}else {
				System.out.println("아직서비스준비중입니다. 다시 입력해주세요");
				
		}
	//	uc.insertUser();
	}
}
}