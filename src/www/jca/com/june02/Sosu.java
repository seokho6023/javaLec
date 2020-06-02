package www.jca.com.june02;

import javax.swing.JOptionPane;

public class Sosu {
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요."));
		int num = input - 1;
		boolean isSosu = true;
		
		while(num > 2) {
			if(input%num==0) {
				isSosu = false;
				break;
			}
				num=num-1;
		}
		  if(isSosu==true) {
			  System.out.println("소수입니다.");
		  }else {
			  System.out.println("소수가 아닙니다.");
		}
	}
}
