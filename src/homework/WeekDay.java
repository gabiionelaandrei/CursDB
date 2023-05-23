package homework;

import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ce zi este astazi?");
	
	int zi = scanner.nextInt();
	
	switch(zi) {
	case 1: 
		System.out.println("Astazi este Luni");
		break;
	case 2:
		System.out.println("Astazi este Marti");
		break;
	case 3: 
		System.out.println("Astazi este Miercuri");
		break;
	case 4:
		System.out.println("Astazi este Joi");
		break;
	case 5: 
		System.out.println("Astazi este Vineri");
		break;
	case 6:
		System.out.println("Astazi este Sambata");
		break;
	case 7:
		System.out.println("Astazi este Duminca");
		break;
	default: 
		System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
}
	
	scanner.close();
}
}