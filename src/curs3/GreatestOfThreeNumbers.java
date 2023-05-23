package curs3;

/*
 * Facem un program care citeste 3 numere de la tastatura
 * Verifica care dintre cele 3 numere este cel mai mare
 * Printeaza rezultatul sub forma :
 * Ex :"First number is the greatest!"
 * Daca cel mai mare numar are un egal, printez :
 * "Some numbers are equal"
 * 
 */

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	
	//int number1, number2, number3;
	int number1;
	int number2;
	int number3;
	
	public void askTheNumbers() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter first number :");
		number1 = scan.nextInt();
		System.out.println("Please enter second number :");
		number2 = scan.nextInt();		
		System.out.println("Please enter third number :");
		number3 = scan.nextInt();
		scan.close();
	}
	
	public void compareTheNumbers() {
		//9 8 3
		if(number1 > number2 && number1 > number3) {
			System.out.println("First number is the greatest!");
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("Second number is the greatest!");
		}else if(number3> number1 && number3 > number2) {
			System.out.println("Third number is the greatest!");
		}else {
			System.out.println("Some numbers are equal!");
		}
		
		
	}
	
	

}
