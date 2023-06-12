package curs9;

public class StringExample {

	public static void main(String[] args) {

		char ch = 'a';
		String chStr = Character.toString(ch);
		String chStr2 = String.valueOf(ch);
		
		boolean bol = true;
		String bolStr = Boolean.toString(bol);
		String bolStr2 = String.valueOf(bol);
		
		String str =  null;
		//System.out.println(str.toString());
		System.out.println(String.valueOf(str));

		
		
	}

	
}