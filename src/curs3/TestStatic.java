package curs3;

public class TestStatic {

	public static void main(String[] args) {

		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.prenume = "Ceva";
		obj.nume = "Altceva";
		obj.printNormal();
		//obj.printStatic();
		
		StaticVsNonStatic.nume = "Altceva";
		StaticVsNonStatic.printStatic();	
		
		/*
		 * 1.compileaza 
		 * ....
		 * 3. incarca in memorie membrii statici
		 * ....
		 * 5. Instantiaza obiecte
		 * 
		 * 
		 */
		
		
	}

}
