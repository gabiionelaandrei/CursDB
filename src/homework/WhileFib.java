package homework;

public class WhileFib {

	public static void main(String[] args) {
		int n4 = 9;
		int a =0;
		int b = 1;
		int counter =0;
		
		
		while(counter < n4) {
			counter++;
		    int c = a + b;
			a = b;
			b = c;
			System.out.println("Seria Fibonacci pentru 9 numere: " + a + ", ");
		}

	}

	}

