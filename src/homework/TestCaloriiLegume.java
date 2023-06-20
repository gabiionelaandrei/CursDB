package homework;

import java.io.IOException;
import java.util.Scanner;
import homework.PropertiesFileLeguma;

public class TestCaloriiLegume {

	public static void main(String[] args) throws IOException {
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Introdu leguma pentru care vrei sa afli numarul de calorii: ");
		String leguma = scan.next().toString();
		
		PropertiesFileLeguma leg = new PropertiesFileLeguma();
		leg.writePropertiesFile();
		String response = leg.readPropertiesFile(leguma);
		//daca exista
		System.out.println(response);
		
		//daca nu exista
		
		do {
			leguma = scan.next().toString();
			response = leg.readPropertiesFile(leguma);
			System.out.println(response);
		}
		while(response.equals("Nu vindem aceasta leguma. Te rog alege o alta leguma."));
		   
scan.close();		
	}
	
}
