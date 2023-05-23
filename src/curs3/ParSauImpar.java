package curs3;

import java.util.Scanner;

public class ParSauImpar {
	
	int number;
	
	public void askTheUserForANumber() {	
		System.out.println("Please enter a number:");
		Scanner scan  =  new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
	}
	
	
	public void checkNumberIsOddOrEven() {
		askTheUserForANumber();
		
		if(number % 2 == 0) {
			System.out.println(number + " : is even!");
			
		}else {
			System.out.println(number + " : is odd!");

		}
		
		/*
		 * @Test(priority = 1)
		 * public void testceva(){
		 * metoda1 (metode de framework)
		 * metoda2
		 * ....
		 * }
		 * 
		 * @Test(priority =2 , dependsOnMethod = "testceva")
		 * public void testaltceva(){
		 * metoda1 (metode de framework)
		 * metoda2
		 * ....
		 * }
		 * 
		 * 
		 */
		
		
	}

}
