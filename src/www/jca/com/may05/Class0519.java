package www.jca.com.may05;

import javax.swing.JOptionPane;

public class Class0519 {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("숫자 입력1:");
		int num1 = Integer.parseInt(input);
		
		String input2 = JOptionPane.showInputDialog("숫자 입력2:");
		int num2 = Integer.parseInt(input2);
		System.out.println(num1+num2);
		
		String input3 = JOptionPane.showInputDialog("실수 입력:");
		double result = Double.parseDouble(input3);
		System.out.println(result);
	}
}
