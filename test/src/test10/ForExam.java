package test10;

public class ForExam {
	
	public static void main(String[] agrs) {
		// 0���� 3�� ���
		
	/*	for(int i=0;i<20;i+=3) {
			System.out.println(i);
		}
		*/
		for(int i=1;i<=20;i++) {
			if(i%7==0) {
			System.out.println(i);
			}
		}
		//���ϱ� j�� ���� 10�� ����϶� ������ּ���
		//i�� ���� 2�� ���  or j�� ���� 3�� ����϶� 
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {				
				if((i!=0 && i%2==0) || (j!=0 && j%3==0)) {
					System.out.println(i*j);
				
				}
			}
		}
	}

}
