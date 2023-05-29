package homework;

public class WhileFib {

	public static void main(String[] args) {
		int n = 9;
		int a =0;
		int b = 1;
		int counter =0;

		while(counter < n) {

			counter++;
		    int c = a + b;
			a = b;
			b = c;
			System.out.print("Seria Fibonacci pentru 9 numere: " + a + ", ");
		}
		
	}

	}

