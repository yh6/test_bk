package test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayTest {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	
	public static void main(String[] agrs) {
		int[] arr = new int[10];
		
		//for���� ����ؼ� 1-20������ ���� ¦���� �Է����ּ���
		
	/*	for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*2;
		}*/
		for(int i=1; i<=arr.length; i++) {
			arr[i] = i*2;
			
		}
		
		printArray(arr);
		
	}

}
