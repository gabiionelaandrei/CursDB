package curs8;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {

		AgeVerifier obj = new AgeVerifier();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		
		try {
			obj.checkAgeLimit(age);
		} catch (InvalidAgeException e) {

			e.printStackTrace();
			System.out.println(" You must be 18 to vote");
			System.out.println(" You must be 18 to gamble");

		}
		
		
	}

}