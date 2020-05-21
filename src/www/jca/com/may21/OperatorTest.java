package www.jca.com.may21;

import javax.swing.JOptionPane;

public class OperatorTest {
	public static void main(String[] args) {
	    /*int num1 = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력1:"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력2:"));
	
		System.out.println("더하기"+(num1+num2));
		System.out.println("빼기"+(num1-num2));
		System.out.println("곱하기"+(num1*num2));
		System.out.println("나누기"+(num1/num2));
		System.out.println("나머지"+(num1%num2));*/
		
		int result = 10;
		int num = 3;
        result = result + num;
        System.out.println(result += num);
        System.out.println(result -= num);
        System.out.println(result *= num);
        System.out.println(result /= num);
        System.out.println(result %= num);
	}
}
