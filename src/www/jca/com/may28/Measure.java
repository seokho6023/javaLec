package www.jca.com.may28;

import javax.swing.JOptionPane;

public class Measure {
	
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요:"));
		int count = 0;
		for(int i = 1; i<= input; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
				count++;
			}
		}
		
		System.out.printf("\n%d의 약수는 %d개 입니다.", input, count);
	}
}
