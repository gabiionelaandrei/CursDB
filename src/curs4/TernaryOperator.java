package curs4;

public class TernaryOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		
		int x = (a>b)?a:b ;
		
		if(a>b) {
			x = a;
		}else {
			x = b;
		}
		
		int num1 = 5;
		int num2 = 8;
		int num3 = 10;
		
		
		int y = num1>num2? num1 : num2<num3?num2 :num3;
		
		
	}

}
