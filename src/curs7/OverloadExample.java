package curs7;

public class OverloadExample {

	public static void main(String[] args) {

		System.out.println(multiply(2, 5));
		
		
		System.out.println('c');
		System.out.println("text");
		System.out.println(123);

		
	}

	public static int multiply(int a, int b) {
		return a *b;
	}
	
	public static double multiply(double a, double b) {
		return a *b;
	}
	
	
}