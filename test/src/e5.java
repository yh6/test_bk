
public class e5 {
	
	public static void main(String[] agrs) {
		int[] arr = {50,40,100,70,10};
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					int tmp= arr[i] ;
					arr[j] = tmp;
				}
			}
		}
	}

}
