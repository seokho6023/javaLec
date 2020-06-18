package www.jca.com.june18;

import java.util.Scanner;

public class LinearSearch {
	
	public int search(int[] arr, int input) {
		int result = 1;
		int i = 0;
		return result;
	}
	public static void main(String[] args) {
		int[] array = {8, 4, 6, 10, 2, 7, 5, 3, 9, 1};
		
		System.out.print("어떤 숫자를 찾을까요?:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		LinearSearch linear = new LinearSearch();
		int where = linear.search(array, input);
		
		System.out.println(where +" 번째에 있네요.");
		scanner.close();
	}
}
