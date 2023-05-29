package curs5;

import java.util.Scanner;

public class WhileExample2 {

	/*
	 * facem un program care ii cere userului numere incontinuu
	 * le inmulteste cu 10
	 * face asta pana cand userul introduce 0
	 * daca a introdus 0, face exit din loop
	 */
	
	public static void main(String[] args) {

		System.out.println("Please enter a number :");
		Scanner scan  =  new Scanner(System.in);
			
		/*for(int nr = scan.nextInt(); nr != 0; nr = scan.nextInt()) {
			System.out.println(nr*10);
			System.out.println("Please enter a number :");
		}	*/
	
	/*	int nr = scan.nextInt();
		while(nr != 0) {
			System.out.println(nr*10);
			System.out.println("Please enter a number :");
			nr = scan.nextInt();
		} */
	
	int nr2;	
	do {
		System.out.println("Please enter a number :");
		nr2 = scan.nextInt();
		if(nr2 == 0) {
			break;
		}
		System.out.println(nr2/0);
		
	}while(nr2 != 0);
	
	}
	
	
}