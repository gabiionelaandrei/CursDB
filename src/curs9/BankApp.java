package curs9;

import java.util.Scanner;

/*
 * Simulam un ATM
 * Informam userul operatiunile disponibile sub forma :
 * 1 Deposit
 * 2 Withdraw
 * 3 CheckBalance
 * 
 * Il intrebam ce operatiune vrea sa faca (1 , 2 sau 3)
 * si procesam operatiunea: 
 * (Deposit inseamna balanta + suma depusa)
 * (Withdraw inseamna balanta - suma retrasa)
 * (Check balance - print balanta)
 * Daca incearca sa depuna mai putin sau egal cu 0 aruncam InvalidAmountEception
 * Daca incearca sa retraga mai mult decat balanta aruncam InsuficentFundsException
 * Daca introduce alta operatriune printam operatiune invalida
 * La finalul fiecarei operatiuni il intreabam daca vrea sa continue
 * Plecam cu balanta 0
 */



public class BankApp {

	public static void main(String[] args) {
		ATM atm =  new ATM();
		Account cont = new Account();
		BankApp bank =  new BankApp();
		bank.printeazaOperatiuni();
		Scanner scan  = new Scanner(System.in);
		String raspuns ="yes";
		
		while(raspuns.equals("yes")) {
			System.out.println("Please enter the desired operation:");
			int action = scan.nextInt();
			
			int suma;
			switch(action){
			case 1:
				System.out.println("Please enter the sum that you want to deposit: ");
				suma =scan.nextInt();
			try {
				cont.deposit(suma);
				break;

			}catch(InvalidAmnoutException e) {
				e.printStackTrace();
			}
			break;
			case 2:
				System.out.println("Please enter the sum that you want to withdraw:");
				suma = scan.nextInt();
				
			try {
				cont.withdraw(suma);
				break;

			}catch(InsuficentFundsException e) {
				e.printStackTrace();
			}
			break;
				
			case 3:	
				cont.checkBalance();
				raspuns = scan.next().toString();
				break;
			default:
				atm.operatiuni(action);
				
		} 
			System.out.println("Do you want to continue? ");
			raspuns = scan.next().toString();
		}
		
		scan.close();
	}
	

	public void printeazaOperatiuni() {
		System.out.println("Hi, Available operations are:");
		System.out.println("1  Deposit");
		System.out.println("2  Withdraw");
		System.out.println("3  Check Balance");

	}

}