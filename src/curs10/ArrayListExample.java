package curs10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list =  new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		System.out.println("------------------------");
		
		System.out.println(list.get(2));
		
		list.add(0, "Carmen");
		
		System.out.println("------------------------");

		list.add(1, "Maria");
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		System.out.println("------------------------");

		System.out.println(list.get(4));
		
		list.add(6, "Vasile");
		
		System.out.println("------------------------");
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		list.remove(0);
		list.remove("Maria");
		
		System.out.println("------------------------");
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		list.clear();
		System.out.println(list.size());
		
		
		
		
	}

}