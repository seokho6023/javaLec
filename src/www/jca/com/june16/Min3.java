package www.jca.com.june16;

import java.util.Scanner;

public class Min3 {
	public int min(int a,int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("정수 a:");
		int a = sc.nextInt();
		System.out.print("정수 b:");
		int b = sc.nextInt();
		System.out.print("정수c:");
		int c = sc.nextInt();
		
		Min3 mm = new Min3();
		int minNum = mm.min(a, b, c);
		System.out.println("최소값 : "+minNum);
		sc.close();
	}
}
