package homework;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbers {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//rezolvareCuFor ();
		rezolvareCuWhile();

	}
	public static void rezolvareCuFor () {
		int[] numere = new int [10];
		System.out.println("Introdu 10 numere: ");

		for(int i =0; i < 10; i++) {
			int numar = scanner.nextInt();
				numere[i] = numar;	
		}
		//System.out.println(Arrays.toString(numere));
		
		for(int j =0; j < numere.length; j++) {
			if(numere[j] % 2==0) {
				System.out.println(numere[j] + " is even: ");
			}
		}
	}
	
	public static void rezolvareCuWhile () {
		int[] numere = new int [10];
		System.out.println("Introdu 10 numere: ");
		int i =0;
		while(i < 10) {
			int numar = scanner.nextInt();
				numere[i] = numar;	
				i++;
		}
		//System.out.println(Arrays.toString(numere));
		int j =0;
		while(j < numere.length) {
			if(numere[j] % 2==0) {
				System.out.println(numere[j] + " is even: ");
			}
			j++;
		}
	}
}
