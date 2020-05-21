package www.jca.com.may05;

import javax.swing.JOptionPane;

public class Parse {
	public static void main(String[] args) {
		/*
		String input = JOptionPane.showInputDialog("원주율의 값은 얼마입니까?");
		double result = Double.parseDouble(input);
		System.out.println("원주율의 값은" + result + "입니다");
		*/
		String input2 = JOptionPane.showInputDialog("정사각형의 한변의 길이를 입력하세요.");
		int result2 = Integer.parseInt(input2);
		System.out.println("정사각형의 한 변의 길이는" + result2 + "입니다.");
		
		String input3 = JOptionPane.showInputDialog("정사각형의 한변의 넓이를 입력하세요.");
		int result3 = Integer.parseInt(input3);
		System.out.println("정사각형의 넓이는" + Math.pow(result3, 2) + "입니다.");
	}
}
