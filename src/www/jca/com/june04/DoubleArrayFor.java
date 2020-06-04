package www.jca.com.june04;

public class DoubleArrayFor {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i= a.length; i>0 ; i--) {
			a[5-i]=i;
			
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i +"] = " + a[i]);
		}
	}
}
