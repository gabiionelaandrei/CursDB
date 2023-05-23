package homework;

import java.util.Scanner;

public class TernaryOperator3 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
		System.out.println("Care este punctajul obtinut? ");
		
		int punctaj = scanner.nextInt();
		
		String calificativ = (punctaj>=90)?"FB":(punctaj<90&&punctaj>=80)?"B":"S";

        String rezultat = (calificativ == "FB" )? "Ai primit : FoarteBine" : (calificativ == "B") ?"Ai primit : Bine":"Ai primit : Suficient";

     System.out.println(rezultat);
		scanner.close();
	}

}
