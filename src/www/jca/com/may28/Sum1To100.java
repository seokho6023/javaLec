package www.jca.com.may28;

public class Sum1To100 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("sum: " + sum);
	}
}
