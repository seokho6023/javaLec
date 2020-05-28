package www.jca.com.may28;

public class PrintStars1 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
