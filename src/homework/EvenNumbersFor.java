package homework;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersFor {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		rezolvareCuFor ();

	}
	public static void rezolvareCuFor () {;
		int[] numere = new int [10];
		
		for(int i =0; i < numere.length; i++) {
			System.out.println("Introdu 10 numere: ");
			int numar = scanner.nextInt();
			numere[i] = numar ;
			if(numere[i] % 2 ==0) {
				System.out.println(numar);
			}
		}
	}
}
