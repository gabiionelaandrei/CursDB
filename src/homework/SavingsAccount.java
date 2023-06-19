package homework;

import curs8.InvalidAgeException;

public class SavingsAccount extends Account{
	
	public SavingsAccount( int accountNumber, double balance, Customer accountOwner) {
		this.setAccountNumber(accountNumber);
		this.balance=balance;
		this.accountOwner=accountOwner;
		

	}
	
	public void withdraw(double suma) throws InsuficientFundsException {
		if(suma > balance) {
			throw new InsuficientFundsException ();
			
		}
		else if (suma < 0) {
			System.out.println("Your amount is invalid");
		}
		else {
			System.out.println("Please pick your money!");
			
			balance = balance - suma;
			System.out.println("Your new balance is: " + balance);
		}
	}
	
	}

