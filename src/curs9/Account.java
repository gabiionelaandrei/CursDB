package curs9;

public class Account {
	
	public int balance = 0;
	
	public void deposit(int amount) throws InvalidAmnoutException{
		
		if(amount <= 0) {
			throw new InvalidAmnoutException(amount + " is not valid!");
		}
		
		balance = balance + amount;
		
		
	}
	
	public void withdraw(int amount) throws InsuficentFundsException{
		
		if(amount > balance) {
			throw new InsuficentFundsException( "Insufiecient funds!Your " + amount + " is grater than " + balance);
		}
		else if (amount<=0){
			System.out.println("You cannot withdraw a negative amount or equal to 0!");
		}
		
		balance = balance - amount;
		
		
	}
	
	public void checkBalance() {
		System.out.println("Your account balance is:" + balance);
		
	}

}