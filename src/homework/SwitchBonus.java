package homework;

import java.util.Scanner;

public class SwitchBonus {

	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		System.out.print("Pentru a afla valoarea bonusului, te rog sa introduci vechimea in ani: ");
		int an = scan.nextInt();

        double vanzari;
        int luna; 
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

            System.out.print("Te rog sa introduci valoarea vanzarilor: ");

            vanzari = scan.nextDouble();

            if (vanzari <= 5000) {

                 bonus = 600;

            }else if(vanzari <= 10000) {

                 System.out.print("Te rog sa introduci luna in care ai efactuat vanzarile (eg:2):  ");

                 luna = scan.nextInt();

                 if(luna >=1 && luna <=6 ) {

                       bonus =800;

                 }else if(luna >=7 && luna <=11 ) {

                       bonus =1000;

                 }else if(luna ==12 ) {

                       bonus =900;

                       System.out.print("In decembrie se vand singure. ");

                 }

            }else {

                 bonus =1200;

            }

            break;

       }

       scan.close();

       System.out.println("Valoarea bonusului tau este de : " + bonus + " RON.");



 }
	}