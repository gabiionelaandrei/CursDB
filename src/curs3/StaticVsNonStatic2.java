package curs3;

public class StaticVsNonStatic2 {

	public static String nume;
	
	public static void main(String[] args) {

		StaticVsNonStatic2 obj = new StaticVsNonStatic2();
		obj.nume = "Johnny";
		System.out.println(obj.nume);
		StaticVsNonStatic2 obj2 = new StaticVsNonStatic2();
		obj2.nume = "Dora";
		System.out.println(obj2.nume);
		System.out.println("-------------------------------");
		System.out.println(obj.nume);
		System.out.println(obj2.nume);

	}

}
