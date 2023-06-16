package curs10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayConversion {

	public static void main(String[] args) {

		Integer[] intArray = {0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0};
		
		List<Integer> list =  new ArrayList<Integer>(Arrays.asList(intArray));
		
		for(Integer num : list) {
			System.out.println(num);
		}
		
		System.out.println("-------------------------------");
		
		Set<Integer> set =  new HashSet<Integer>(Arrays.asList(intArray));
		
		for(Integer num : set) {
			System.out.println(num);
		}
	}

}