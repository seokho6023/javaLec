package www.jca.com.june16;

import java.util.Scanner;

public class SignOf01 {
	public int signOf(int num) {
		int result = 0;
		
		if(num < 0) {
			result = -1;
		}else if(num > 0) {
			result = 1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		SignOf01 signup = new SignOf01();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력:");
		int input = sc.nextInt();
		int signResult = signup.signOf(input);
		
		System.out.println("signResult: "+ signResult);
		sc.close();
	}
}
