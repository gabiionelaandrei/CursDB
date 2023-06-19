package curs10;

public class StringBuilderExample {

	public static void main(String[] args) {

		reverseString("masina");
		replaceFromString("Salut Bogdan");
		deleteFromString("telenciclopedie");
		insertIntoString("Bogdan");
		addSpacesToText("thisIsACamelCaseText");
		
	}

	public static void reverseString(String text) {		
		StringBuilder sb =  new StringBuilder(text);
		System.out.println(sb);	
		sb.reverse();
		System.out.println(sb);		
	}
	
	public static void replaceFromString(String text) {
		StringBuilder sb =  new StringBuilder(text);
		System.out.println(sb);	
		sb.replace(6, 12, "Oana");
		System.out.println(sb);
	
	}
	public static void deleteFromString(String text) {
		StringBuilder sb =  new StringBuilder(text);
		System.out.println(sb);	
		sb.delete(2, 9);
		System.out.println(sb);	
	}
	
	public static void insertIntoString(String text) {
		StringBuilder sb =  new StringBuilder(text);
		System.out.println(sb);
		sb.insert(0, "Salut ");
		System.out.println(sb);
	}
	
	//thisIsACamelCaseText
	public static void addSpacesToText(String text) {
		StringBuilder sb =  new StringBuilder(text);
		System.out.println(sb);
		
		for(int i = 0; i<sb.length(); i++) {
			
			if(Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
		}
		System.out.println(sb);

		
	}
	
}