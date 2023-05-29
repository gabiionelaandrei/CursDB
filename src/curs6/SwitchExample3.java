package curs6;

import java.util.Scanner;

public class SwitchExample3 {
	/*
	 * facem un program care imi cere de la tastatura un an si o luna
	 * si printeaza cate zile are luna respectiva
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Te rog introdu un an :");
		int an = scan.nextInt();
		System.out.println("Te rog introdu o luna :");
		int luna = scan.nextInt();
		int days = 0;
		
		//an%4 == 0 && an%100 != 0  || an%400 == 0
		//1 3 5 7 8 10 12 == 31 days
		//4 6 9 11 == 30 days
		// 2  == 28 ||29
		
		
		switch(luna) {
		 case 4:
		 case 6:
		 case 9:
		 case 11:
			 days = 30;
			 break;
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10:
		 case 12:
			 days = 31;
			 break;
		 case 2:
			 if(an%4 == 0 && an%100 != 0  || an%400 == 0) {
				 days = 29;
			 }else {
				 days = 28;
			 }
			 //days = (an%4 == 0 && an%100 != 0  || an%400 == 0)? 29:28;
			 break;
		default:
			System.out.println("Valoare invalida!");
		
		}
		
		System.out.println("Luna aleasa de tine are:" + days);
		
	}

}