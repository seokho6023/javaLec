package www.jca.com;

public class Class0430 {
	
	public static void main(String[] args) {
		Storage storage = new Storage();
		storage.num1 = 10;
		storage.num2 = 15;
		
		int total = storage.num1 + storage.num2;
		
		System.out.print("total: " + (total + storage.num1));
		//System.out.println("------------------");
	}
}
