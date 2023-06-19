package curs9;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put(1, "negru");
		map.put(33, "alb");
		map.put(88, "verde");
		
		System.out.println(map);
		
		System.out.println(map.get(88));
		
		System.out.println("------------------------");
		
		for(Integer key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("------------------------");

		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("------------------------");
		
		System.out.println( "Key " + map.containsKey(22));
		
		System.out.println( "Value " + map.containsValue("alb"));

		
		map.replace(1, "rosu");
		
		System.out.println(map);
			
		map.remove(1);
		
		System.out.println(map);

	}

}