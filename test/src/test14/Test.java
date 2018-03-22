package test14;

class Exam{
	String text;
	public void print() {
		System.out.println("이너클래스의 함수 호출");
	}
}
public class Test {
		
	Exam e ; //new 해주지 안앗기 때문에 null 나옴.
	
	public static void main(String[] args) {
		Test t = new Test(); //주소가 나옴
		//t.e = new Exam();
		System.out.println(t.e); 
		
		Exam[] eArr = new Exam[3];
		System.out.println(eArr[0]); //Exam[0]을 new 해주지 안햇기 때문에 null 나옴. ==비교는 주소비교
	}
	
}
