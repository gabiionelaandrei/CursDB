package curs9;

import java.util.Scanner;

/*
 * Avem nevoie de o serie de coduri postale si orasele asociate
 * avem nevoie de aceste coduri inca de la initializare (6 orase)
 * Avem nevoie de o functionalitate in care sa caut pe baza unui cod postal
 * si sa imi aduca orasul asociat
 * Daca codul introdus nu exista atunci vreau sa arunc PostalCodeException
 * Daca codul exista, printez orasul
 * Daca avem, exceptia atunci vrea sa intreb din nou pana primesc cod valid
 * 
 * 
 */

public class SearchPostalCode {


	
	public static void main(String[] args) throws PostalCodeException {
		CoduriPostale codPostal =  new CoduriPostale();
		System.out.println(codPostal.cp);
		Scanner scan = new Scanner(System.in);
				
		while(true) {
			System.out.println("Introdu un cod postal :");
			int codP = scan.nextInt();
			
			try {
				System.out.println(codPostal.gasesteOras(codP));
				break;

			}catch(PostalCodeException e) {
				e.printStackTrace();
			}
		}
		

		
		
	//	while(!codPostal.cp.containsKey(codP)) {
	//		codPostal.gasesteOras(codP);
	//	}
		
		
	}

}