package test10;

public class ForExam {
	
	public static void main(String[] agrs) {
		// 0부터 3의 배수
		
	/*	for(int i=0;i<20;i+=3) {
			System.out.println(i);
		}
		*/
		for(int i=1;i<=20;i++) {
			if(i%7==0) {
			System.out.println(i);
			}
		}
		//곱하기 j의 값이 10의 배수일때 출력해주세요
		//i의 값이 2의 배수  or j의 값이 3의 배수일때 
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {				
				if((i!=0 && i%2==0) || (j!=0 && j%3==0)) {
					System.out.println(i*j);
				
				}
			}
		}
	}

}
