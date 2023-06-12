package curs9;

public class Tester <T> {

	T age;
	
	public Tester(T age) {
		this.age = age;
	}
	
	public void printAge() {
		System.out.println( age);
	}
}