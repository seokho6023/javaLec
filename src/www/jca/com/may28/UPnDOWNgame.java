package www.jca.com.may28;

import java.util.Random;
import java.util.Scanner;

public class UPnDOWNgame {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(100) +1;
		System.out.println("UP & DOWN 게임 시작");
		System.out.println("1~100 사이의 숫자를 맞춰보세요.");
		int count = 0;
		int user = 0;
		while(user!=answer) {
			System.out.print("숫자를 입력하세요 ->");
			user = stdIn.nextInt();
			
			if(user>answer) {
				System.out.println("DOWN");
			}else if(user<answer) {
				System.out.println("UP");
			}
			count++;
		}
		System.out.println(count+"번만에 맞췄어요.");
		System.out.println("정답은 " + answer +"입니다.");
		
		stdIn.close();
	}
}
