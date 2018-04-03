package last;

import java.util.Arrays;

public class ex {
	int[] arr = {70,60,50,100,40};
	
	for(int i=0;i<5;i++) {
		for(int j=i+1;j<5;j++) {
			if(arr[i]<arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}

		for(int i=0;i<5;i++) {
			System.out.printf("arr[%d]=%d",i,arr[i]);
	}
}

}


}
