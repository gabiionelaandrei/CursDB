package homework;

import java.util.Scanner;

public class TestCatalog {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		Catalog ct = new Catalog();
		System.out.println("Cum te cheama? ");
		String nume = scan.next().toString();
		System.out.println("Ce nota ai luat? ");
		int nota =scan.nextInt();

		ct.adaugaElev(nume, nota);
		System.out.println("Catalogul contine urmatorii elevi " + ct.afisareCatalog());
	}

}
