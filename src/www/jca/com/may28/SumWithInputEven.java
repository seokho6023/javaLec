package www.jca.com.may28;

import javax.swing.JOptionPane;

public class SumWithInputEven {
	
	public static void main(String[] args) {
		int sum = 0;
		
		int input = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요:"));
		
		for(int i=0; i <= input; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		System.out.println("1부터" + input +"까지 짝수들의 합은"+ sum+"입니다.");
	}
}
