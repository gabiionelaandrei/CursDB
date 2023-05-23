package homework;

import java.util.Scanner;

public class YourResult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Te rog introdu punctajul obtinut: ");
		
		int punctaj = scanner.nextInt();
		
		if (punctaj >= 0 && punctaj <65) {
			System.out.println("Ai picat. Mai Incearca.");
		}
		else if (punctaj >= 65 && punctaj <=100) {
			System.out.println("Felicitari, Ai trecut");
		}
		else {
			System.out.println("Valoarea introdusa nu este valida!");
		}
		scanner.close();

	}

}
