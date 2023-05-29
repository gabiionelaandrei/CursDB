package homework;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scanner  = new Scanner(System.in);
		

		int counter=0;
		while(counter<3) {
			counter ++;
			System.out.print("User: ");
			String user = scanner.nextLine();;


			System.out.print("Password: ");
			int parola = scanner.nextInt();
	
			
			if(user.equals("TestUser") && parola == 1234) {
				System.out.println("Login Sucessful");
				break;
			}
	
			else {
				System.out.println("Login Error!");
			}
			while(counter >=3)
			{
				System.out.println("Maximum attempts reached. User blocked");
				break;
			}
			
		} 
		
		scanner.close();
	}

}
