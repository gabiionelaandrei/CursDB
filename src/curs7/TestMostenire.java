package curs7;

public class TestMostenire {

	public static void main(String[] args) {

		//Tester obj =  new Tester();
		//obj.setEmail(null);
		
		
		//Angajat -> Tester -> TesterAutomat
		
		TesterAutomat obj = new TesterAutomat();
		obj.setProgrammingLang("Java");//clasa TesterAutomat
		obj.setDepartament("QA");// clasa Tester
		obj.setSeniority("Junior");//clasa Tester
		obj.setEmail("maria@maria.ro");//clasa Angajat
		obj.setNume("Maria");//clasa Angajat
		
		
		
	}

}