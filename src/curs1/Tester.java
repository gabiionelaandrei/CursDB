package curs1;
 // one line comment

/*
 * multi line comment
 */

//UpperCamelCase         //metoda_mea_care_face_lucruri(snake_case)
//lowerCamelCase         //metodaMeaCareFaceLucruri

public class Tester {     
	//variabile
	private String nume;
	public int ratePerHour;
	
	
	//getter
	public String getNume() {
		return nume;
	}
	//setter
	public void setNume(String nume) {
		this.nume = nume;
	}
	//constructor
	//public Tester() {}
	
	public Tester(String nume, int rate) {
		setNume(nume);
		ratePerHour = rate;
	}
	
	public Tester(String nume, int rate, int numar) {
		setNume(nume);
		ratePerHour = rate;
	}

	
		
	//Tester obj = new Tester();
	/*
	 * Tester --Numele clasei
	 * obj - numele obiect
	 * =  - operator de atriburie
	 * new - cuvant cheie in java care ne ajuta sa instantiem o clasa
	 * Tester() - constructor
	 */
	
	//Tester obj = new Tester();
	//obj.setNume("Oana");

}
