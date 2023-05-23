package homework;

import java.util.Scanner;

public class TernaryOperator1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Care este valoarea facturrii? ");
		
		double factura = scanner.nextDouble();
		
		factura = (factura > 100) ? factura- (factura * 10/100): factura- (factura * 5/100);
		System.out.println("Valoarea facturii dupa aplicarea discountului este: " + factura);
		
scanner.close();
	}

}
