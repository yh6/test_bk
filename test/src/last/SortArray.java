package last;

import java.util.Scanner;

public class SortArray {
	
	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[5];	
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			 System.out.println((i+1)+ "번째 숫자를 입력하세요");			 
			 arr[i] = Integer.parseInt(s.nextLine());
			 sum += arr[i];	
			
		}
		System.out.println(sum);
		System.out.println(sum/5);

		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
}
