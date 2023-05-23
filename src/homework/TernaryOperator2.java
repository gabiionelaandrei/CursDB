package homework;

public class TernaryOperator2 {

	public static void main(String[] args) {
		int comision;
		int vanzari =3500;
		if(vanzari > 2500) {
			comision = vanzari *5/100;	
			System.out.println("Valoarea comisionului pentru vanzarile > 2500 este: " + comision);
		}
		else {
			System.out.println("Pentru vanzarile < 2500 nu se aplica comision.");
		}

	}

}
