package www.jca.com.june11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodPractice3 {
	public int[] makeRandom(int input) {
		int[] arr = new int[input];
		Random rand = new Random();
		for(int i=0; i<input; i++) {
			arr[i] = rand.nextInt(input) + 1;
		}
		return arr;
	}
	public static void main(String[] args) {
		MethodPractice3 m = new MethodPractice3();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		
		int[] array = m.makeRandom(num);
		System.out.println(Arrays.toString(array));
		scanner.close();
	}
}
