package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Produse {

	public static void main(String[] args) {
		List<String> produseCat1 =  new ArrayList<>(Arrays.asList("Product1", "Product2", "Product3", "Product4", "Product5"));
		List<String> produseCat2 =  new ArrayList<>(Arrays.asList("Product1", "Product2", "Product6", "Product4", "Product8"));
		List<String> raspuns =  new ArrayList<>();
		
		for(String produs : produseCat1) {
			
			if(produseCat2.contains(produs)) {
				raspuns.add("YES");			
			}
			else {
				raspuns.add("NO");
			}	
		}
System.out.println(raspuns);
	}

}
