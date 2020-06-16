package www.jca.com.june16;

import java.util.Arrays;

public class Flbonacci {

	public static void main(String[] args) {
		int[] arr = new int[50];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<50; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
			
		System.out.println(Arrays.toString(arr));
	}
}
