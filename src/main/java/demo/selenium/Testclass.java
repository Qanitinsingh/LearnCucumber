package demo.selenium;

public class Testclass {

	public static void main(String args[]) {

		Testclass t = new Testclass();
		
		t.add();
		t.multiply();
		

	}

	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	public void multiply() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}
}