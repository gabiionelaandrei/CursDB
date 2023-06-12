package curs9;

import java.util.HashMap;
import java.util.Map;

public class ATM {
	
	public Map<Integer, String> operatiuni;
	
	public ATM() {
		operatiuni = new HashMap<Integer, String>();
		operatiuni.put(1, "Deposit");
		operatiuni.put(2, "Withdraw");
		operatiuni.put(3, "Check Balance");

	}

	public void operatiuni(int valoare) {
		
		if(operatiuni.containsKey(valoare)) {
			System.out.println("You choose the following action: " + valoare + " , " + operatiuni.get(valoare));
		}
		else {
			System.out.println(valoare + " is an invalid action. Please enter a valid action: 1, 2 or 3");
		}
		}
	}
	
	
