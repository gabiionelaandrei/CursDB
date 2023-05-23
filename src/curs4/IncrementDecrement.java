package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {

		//nr++    nr = nr +1      nr +=1
		//post increment --> nr++
		//pre increment --> ++nr
		
		
		System.out.println("----POST");
		int num = 10;
		System.out.println("Valoarea lui num inainte de increment este "+ num);
		System.out.println("Valoarea lui num in POST increment este " + num++);//dupa executie face increment
		System.out.println("Valoarea lui num dupa POST increment este "+ num);

		System.out.println("----PRE");
		int num1 = 10;
		System.out.println("Valoarea lui num inainte de increment este "+ num1);
		System.out.println("Valoarea lui num in PRE increment este " + ++num1);
		System.out.println("Valoarea lui num dupa PRE increment este "+ num1);
		
	}

}
