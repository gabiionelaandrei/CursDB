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
		
		balance = balance - amount;
		
		
	}
	
	public void checkBalance() {
		System.out.println("Your account balance is:" + balance);
		
	}

}