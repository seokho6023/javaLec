package www.jca.com.june16;

import java.util.Scanner;

public class SumUp1 {
	int sumUpTo(int n) {
		int sum = 0;
		for(int i=0; i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력");
		int input = sc.nextInt();
		
		SumUp1 ss = new SumUp1();
		int result = ss.sumUpTo(input);
		
		System.out.println("합계: "+ result);
		sc.close();
	}
}
