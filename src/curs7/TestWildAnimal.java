package curs7;

public class TestWildAnimal {

	public static void main(String[] args) {

		/*WildAnimal animal =  new WildAnimal();
		animal.makeSound();
		
		System.out.println("------------------");
		Deer bambi =  new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		System.out.println("------------------");
		Lion simba =  new Lion();
		simba.makeSound();
		simba.eatMeat();  */
		
		//WebDriver driver = new ChromeDriver();
		
		/* WildAnimal este mostenit de catre Lion
		 * aici apare relatia Lion is an WildAnimal
		 * java imi permite sa fac obictul Lion de tip 
		 * WildAnimal, pentru ca Lion is an WildAnimal
		 * 
		 */
		WildAnimal simba = new Lion();
		simba.makeSound();
		((Lion)simba).eatMeat();
		
	}

}