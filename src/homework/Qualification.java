package homework;

public class Qualification extends Teacher{

	public Qualification(String course, int experienceYears, String schedule) {
		super.course=course;
		super.experienceYears=experienceYears;
		super.schedule=schedule;
	}

	
	public void verify(){
		if(experienceYears > 3 && course.equals("Java") && schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}
		
		else {
			System.out.println("You do not qualify");
		}
	}


}
