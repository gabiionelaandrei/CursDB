package curs4;

import java.util.Scanner;

public class ConditionalOperator {
	/*
	 * program care citeste 2 nr de la tastatura
	 * daca fiecare nr este pozitiv
	 * daca ambele nr sunt pozitive
	 * care dintre cele 2 numere este cel mai mic sau daca sunt egale
	 * 
	 * if else
	 * ternary
	 * 
	 */
	
	
	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
		
		
		if(num1 >= 0) {
			System.out.println("Num1 is pozitive");
		}else {
			System.out.println("Num1 is negative");
		}
		//result = conditie?expersie1:expresie2
		String result = num1>=0?"Num1 is pozitive":"Num1 is negative";
		System.out.println("TR = " +result);
		
		
		if(num2 >= 0) {
			System.out.println("Num2 is pozitive");
		}else {
			System.out.println("Num2 is negative");
		}
		
		result = num2>=0?"Num2 is pozitive":"Num2 is negative";
		System.out.println("TR = " +result);
		
		if(num1 >= 0 && num2 >= 0) {
			System.out.println("Numbers are pozitive");
		}else {
			System.out.println("Numbers are negative");
		}
		result = num1 >= 0 && num2 >= 0?"Numbers are pozitive":"Numbers are negative";
		System.out.println("TR = " +result);
		
		
		if(num1>num2) {
			System.out.println("Num1 is the greatest");

		}else if(num1 <num2) {
			System.out.println("Num2 is the greatest");

		}else {
			System.out.println("Numbers are equal");
		}
		result = num1>num2?"Num1 is the greatest":
			    num1<num2?"Num2 is the greatest":"Numbers are equal";
		System.out.println("TR = " +result);

	}

}
