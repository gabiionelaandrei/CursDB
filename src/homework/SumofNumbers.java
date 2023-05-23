package homework;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		int suma =0;	

		Scanner scanner = new Scanner(System.in);
		for( int i = 1; i <= 10; i++) { 

            System.out.println("Please enter number " + i);

            int nr = scanner.nextInt();

            suma += nr;

       }

       System.out.println("The sum of numbers is: " + suma);
		scanner.close();
		

	}

}
