package homework;

public class FibFor {

	public static void main(String[] args) {
		int n = 9;
		int a =0;
		int b = 1;
		
		
		
		for(int i = 1; i <= n; ++i) {
			
		    int c = a + b;
			a = b;
			b = c;
			System.out.println("Seria Fibonacci pentru 9 numere: " + a + ", ");
		}
		

	}

}
