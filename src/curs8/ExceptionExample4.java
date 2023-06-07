package curs8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample4 {
//Metoda de a face impartire a doua numere 
	public static void main(String[] args) {
		ExceptionExample4 obj = new ExceptionExample4();
		obj.division();
		
	}
	
	public void division() {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, sum;
		
		//boolean flag =  true;
		
		do {
			
			try {
				System.out.println("Please enter num1 :");
				try {
					num1 =  Integer.parseInt(scan.next());

				}catch(NumberFormatException e) {
					System.out.println("Please enter only numeric!");
					continue;
				}
			while(true) {
				System.out.println("Please enter num2 :");
				try {
					num2 =  Integer.parseInt(scan.next());

				}catch(NumberFormatException e) {
					System.out.println("Please enter only numeric!");
					continue;
				}	
			break;
			}
						
			
			if(num2 == 0) {
				throw new ArithmeticException("Num2 is 0. You cannot divide by zero. Try again!");
			}
				
			sum = num1/num2;
			System.out.println("Result " + sum);
			break;

			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	//getMessage printeaza doar mesajul pe care iese exceptia
			
		}while(true);
		
		
	}
	
	
}