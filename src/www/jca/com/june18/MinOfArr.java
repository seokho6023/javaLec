package www.jca.com.june18;

public class MinOfArr {
	public int minOf(int[]a) {
		int min = a[0];
		for (int i=1; i<a.length;i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}	
		return min;
	}
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=5;
		arr[1]=7;
		arr[2]=3;
		arr[3]=2;
		arr[4]=6;
		// int[] arr = {5,7,3,2,6}; 
		MinOfArr ss = new MinOfArr();
		int result = ss.minOf(arr);
		System.out.println("배열의 최솟값:"+ result);
	}
}
