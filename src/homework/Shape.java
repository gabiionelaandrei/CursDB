package homework;

public class Shape {

	//constructori
	public Shape(int length) {
		calculateSquareArea(length);
		
	}
	
	public Shape(int length, int width) {
		calculateRectangleArea(length,width);
	}
	
	public Shape(double radius) {
		  double raza = radius * radius * Math.PI;
		  System.out.println("The area of the circle is: " + raza);}
	
	//metoda
	
	public void calculateSquareArea(int length) {
		int area = length * length;
		
		System.out.println("The area of the square is: " + area);
	}
	public void calculateRectangleArea(int length, int width) {
		int area = length * width;
		System.out.println("The area of the rectangle is : " + area);
	}



}
