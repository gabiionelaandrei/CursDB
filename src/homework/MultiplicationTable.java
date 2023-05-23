package homework;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int nr = scanner.nextInt();
		 for( int i = 0; i <= 10; i++) {

		       System.out.println( nr + " * " + i + " = " + nr*i);

		       }
		scanner.close();
	}

}
