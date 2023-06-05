package homework;

public class AplicatieTeacher {

	public static void main(String[] args) {
		
		Qualification qualification1 = new Qualification("Java",4, "Afternoon");
		Qualification qualification2 = new Qualification("Java",3, "Afternoon");
		Qualification qualification3 = new Qualification("Java",3, "Morning");
		Qualification qualification4 = new Qualification("Python",3, "Afternoon");
		
        qualification1.verify();
        qualification2.verify();
        qualification3.verify();
        qualification4.verify();
	}

}
