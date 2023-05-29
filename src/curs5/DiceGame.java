package curs5;

import java.util.Scanner;

public class DiceGame {
	/*
	 * Facem un joc de zaruri care are urmatoarele reguli:
	 * daca userul da in total : 2, 6, 12 > pierde jocul > ne oprim
	 * daca userul da in total : 3, 7 > castiga jocul > ne oprim
	 * daca userul da in total : 4, 11, 8 > repeta automat aruncarea
	 * daca da oricare dintre variantele care nu au fost enumerate mai sus
	 * atunci il intrebam daca vrea sa mai joace
	 * Raspunsul va fi un boolean : true sau false
	 *  
	 */
	
	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		int dice1;
		int dice2;
		boolean startJoc =  true;

		
		while(startJoc) {
			
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			int total = dice1 + dice2;
			System.out.println("Ai dat :" + total);

			if(total ==2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau. Ai dat " + total + " Ai pierdut");
				//break;
				startJoc = false;
				
			}else if(total ==4 || total == 8 || total == 11) {
				System.out.println("Automat mai dai o data");
			
			}else if(total ==3 || total == 7 ) {
				System.out.println("You`re the winner!");
				startJoc = false;
			}else {
				System.out.println("Ai dat :" + total + " Mai vrei sa joci ?");
				String raspuns = scan.next();
				if(raspuns.equalsIgnoreCase("yes")){
					startJoc = true;
				}else {
					startJoc = false;
				}
			}
			
		}
		System.out.println("Game over!");
	
	}

}