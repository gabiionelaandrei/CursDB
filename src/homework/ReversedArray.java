package homework;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		rezolvareCuFor();
		rezolvareCuWhile();
		scanner.close();
	}
	

	
	public static void rezolvareCuFor () {
		System.out.println("Cate elemente trebuie sa aiba array-ul?");
		int lungime = scanner.nextInt();
		int[] elemente = new int [lungime];
		for(int i =0; i < elemente.length; i++) {
			System.out.println("Valoare element " + (i+1));
			int element = scanner.nextInt();
			 elemente[elemente.length-i -1] = element;
		}

		System.out.println(Arrays.toString(elemente));
	}
	
	public static void rezolvareCuWhile () {
		System.out.println("Cate elemente trebuie sa aiba array-ul?");
		int lungime = scanner.nextInt();
		int[] elemente = new int [lungime];
	    int i =0;
		while(i< elemente.length) {
			System.out.println("Valoare element " + (i+1));
			int element = scanner.nextInt();
			 elemente[elemente.length-i -1] = element ;
			 i++;
		}
		

		System.out.println(Arrays.toString(elemente));
	}
	

}
