package curs9;

public class VarargsExample {

	public static void main(String[] args) {

		printArguments("test", "test2");
		
		//JavascriptExecutor
		//excuteScript("", webelemen1 )
		//excuteScript("", webelemen1, webelement2 )
		
		printVariabileArguments(3,"unu", "doi", "trei", "patru");
		
	}

	public static void printArguments(String str1, String str2) {
		
		System.out.println(str1 +  " " + str2 );
		
	}
	
	public static void printVariabileArguments(int num, String ceva, String...values) {
		
		for(String obj:values) {
			System.out.println(obj);
		}
	}
	
	
	
}