package curs8;

public class AgeVerifier {

	public void checkAgeLimit(int age) throws InvalidAgeException {
		
		if(age <18) {
			throw new InvalidAgeException("Happy Day");
			
		}else {
			
			System.out.println("you are allowed");
		}
	}
	
	
}