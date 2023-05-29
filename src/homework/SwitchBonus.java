package homework;

import java.util.Scanner;

public class SwitchBonus {

	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		System.out.print("Pentru a afla valoarea bonusului, te rog sa introduci vechimea in ani: ");
		int an = scan.nextInt();
		System.out.print("Te rog sa introduci valoarea vanzarilor: ");
		double vanzari = scan.nextDouble();
		System.out.print("Te rog sa introduci luna in care ai efactuat vanzarile (eg:2):  ");
		int luna = scan.nextInt();
		
		int bonus=0;
		
		switch(an) {
		case 1:
			bonus =100;
			System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");
			break;
		case 2:
			bonus =200;
			System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");
			break;
		case 3:
			if (vanzari <= 5000) {
				bonus = 600;
				System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");
			}
			else if(vanzari <= 10000 && luna >=1 && luna <=6 ) {
				bonus =800;
				System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");
			}
			
			else if(vanzari <= 10000 && luna >=7 && luna <=11 ) {
				bonus =1000;
				System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");
			}
			else if(vanzari <= 10000 && luna ==12 ) {
				bonus =900;
				System.out.println("In decembrie se vand singure, insa valoarea bonusului tau este de : " + bonus + " RON.");
			}
			else {
				bonus =1200;
				System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");
			}
			break;
	
		}
	
		scan.close();
	
	}

}
