package www.jca.com.may28;

import javax.swing.JOptionPane;

public class Pyramid {
	
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요:"));
		for(int i=0; i<input; i++) {
			for(int j=0; j<input-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j< 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
