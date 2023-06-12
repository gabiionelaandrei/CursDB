package curs9;

public class TestTester {

	public static void main(String[] args) {

		Tester t1 =  new Tester(20.0);
		t1.printAge();
		
		Tester t2 =  new Tester(25);
		t2.printAge();
		
		Tester t3 =  new Tester("35");
		t3.printAge();
		
		Tester t4 =  new Tester('9');
		t4.printAge();
		
	}

}