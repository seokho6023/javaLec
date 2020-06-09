package www.jca.com.june09;

import javax.swing.JOptionPane;

public class FunTest1 {
	
	public int sum(int a, int b) {
		System.out.println("합은"+(a+b)+"입니다.");
		return a+b;
	}
	double sales_tax(double price) {
		return 0.05 * price;
	}
	double sales_tax(double price,double rate) {
		return rate * price;
	}
	
	public static void main(String[] args) {
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		FunTest1 fun=new FunTest1();
		int sumResult = fun.sum(num1, num2);
		System.out.println(sumResult);
		System.out.println(fun.sales_tax(10.00));
		System.out.println(fun.sales_tax(20.00));
		System.out.println(fun.sales_tax(30.00));
		System.out.println(fun.sales_tax(10.00,0.05));
		System.out.println(fun.sales_tax(20.00,0.1));
		System.out.println(fun.sales_tax(30.00,0.2));
	}
}
