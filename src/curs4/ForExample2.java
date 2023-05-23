package curs4;

import java.util.Scanner;

public class ForExample2 {

	/*
	 * facem un program care ii cere userului numere incontinuu
	 * le inmulteste cu 10
	 * face asta pana cand userul introduce 0
	 * daca a introdus 0, face exit din loop
	 */
	
	public static void main(String[] args) {

		System.out.println("Please enter a number :");
		Scanner scan  =  new Scanner(System.in);
		
	/*	for(;;) {
			int nr = scan.nextInt();
			if(nr == 0) {
				break;
			}
			System.out.println("Please enter a number :");
			System.out.println(nr*10); 
		}
*/		
		for(int nr = scan.nextInt(); nr != 0; nr = scan.nextInt()) {
			System.out.println(nr*10);
			System.out.println("Please enter a number :");
		}
		
		
	}

}
