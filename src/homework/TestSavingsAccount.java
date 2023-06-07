package homework;

import java.util.Scanner;

public class TestSavingsAccount {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Customer customer1 = new Customer("Ionut","Str. Frigului","ionutP@db.com");
		SavingsAccount account1 = new SavingsAccount (001, 100.5, customer1);
		System.out.println("Hi " + customer1.getName());
		System.out.println("Please enter the amount to widraw");
		
		double suma = scanner.nextDouble();
		
		
		try {
			account1.withdraw(suma);
		} catch (InsuficientFundsException e) {

			
			System.out.println(" The ampunt you entered is greater than the available balance:" + account1.balance);
			System.out.println(" Thank you for using our ATM");
			e.printStackTrace();

		};
	}	
}
