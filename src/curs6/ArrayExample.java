package curs6;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray =  new String[5];
	//  index : 				0      1     2     3     4
		System.out.println(textArray[1]);
		textArray[1] = "Maria";
	//  String[] textArray = {null , "Maria", null, null, null};
		System.out.println(textArray[1]);
		System.out.println(textArray[3]);
		textArray[3] = "Oana";
	//  String[] textArray = {null , "Maria", null, "Oana", null};		
		System.out.println(textArray[3]);
		textArray[3] = "George";
		System.out.println(textArray[3]);

		
		System.out.println("--------------------------------");
		
		//System.out.println(textArray[5]);
		//System.out.println(textArray[3].length());
		
		
		try {
			System.out.println(textArray[5]);

		}catch(Exception e) {
			System.out.println("Ai incercat sa accesezi in afara array-ului");
		
		}
		System.out.println("Alt cod");

	}

}