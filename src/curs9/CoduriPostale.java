package curs9;

import java.util.HashMap;
import java.util.Map;

public class CoduriPostale {
	
	 Map<Integer, String > cp;
	
	public CoduriPostale() {
		cp = new HashMap<Integer, String>();
		cp.put(407, "Cluj");
		cp.put(117, "Pitesti");
		cp.put(234, "Slatina");
		cp.put(250, "Bucuresti");
		cp.put(900, "Iasi");
		cp.put(807, "Craiova");

	}
	
	public String gasesteOras(int codPostal) throws PostalCodeException  {
	
		if(cp.containsKey(codPostal)) {
			
			return cp.get(codPostal);
		}else {
			throw new PostalCodeException("Codul postal nu exista");
			
		
		
	}	
		
		
		
		
	}
	
}