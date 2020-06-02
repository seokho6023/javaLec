package www.jca.com.june02;

import java.util.Scanner;

public class SumUp {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n = -1;
		while(n!=0) {
			System.out.print("n을 입력해주세요:");
			n= stdIn.nextInt();
			
			int sum = 0;
			for(int i=1; i<n; i++) {
					System.out.print(i + " + ");
					sum += i;
			}
			System.out.print(n + " = ");
			sum += n;
			System.out.println(sum);
		}
		stdIn.close();
	}
}
