package test12;

import java.util.ArrayList;

// 자바2 책에 있는 컬랙션- ArrayList,HashMap  / 제네릭-<>타입
public class Execute {
	
	public static void main(String[] args) {
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();  
		new Dog("카드",5,"요쿠셔").back();
		new Dog("카드",5,"요쿠셔").run();
		new Dog("카드",5,"요쿠셔").toString();
		System.out.println();
		dogList.add(new Dog("뽀삐",5,"요쿠셔")); //Dog dog = new Dog("카드1",5,"요쿠셔"); dogArr.add(dog);
		dogList.add(new Dog("쭁",10,"푸들"));
		dogList.add(new Dog("메리",3,"차우차우"));
		dogList.add(new Dog("꽃송이",7,"포메"));
		dogList.add(new Dog("망고",1,"말라뮤트"));
		//dogList.remove(1); //방(index)삭제
		for(Dog d:dogList) {
			System.out.println(d);
		
		}
		
	}
}
