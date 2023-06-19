package curs7;

import curs7.Shape;

public class Patrat extends Shape{

	public Patrat(String nume, String culoare) {
		super(nume, culoare);
	
	}
	//obiect al clasei Patrat
	String nume = "Patrat";
	String culoare = "Negru";
	//obiect al clasei Shape
	//super.nume
	
	//super --> referinta catre obiectul clasei parinte
	public void printDetails() {
		System.out.println("Numele este " + super.nume +
				" si culoarea este " + super.culoare);
	}

}