package homework;

import java.util.Scanner;

public class YourAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu varsta:");
		
		int age = scanner.nextInt();
		
		if(age <18) {
			System.out.println("Esti minor!");
		}
		else if(age >=18 && age <=65) {
			System.out.println("Esti adult :)");
		}
		else {
			System.out.println("Esti batran :p");
		}
		scanner.close();

	}

}
