package test07;

public class Exam {
	public static int a;
	
	public static void main(String[] args) {
		Exam e = new Exam();
		e.a=10;
		System.out.println(e.a);
		
		Exam e1 = new Exam();  //static이기때문에 같은곳을 바라보기 때문에 여기서 a는 초기화가 안되고 10인상태에서 4로 바뀜
		e1.a=4;
		System.out.println(e.a);
	}

}
