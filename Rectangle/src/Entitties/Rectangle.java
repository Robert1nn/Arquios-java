package Entitties;

public class Rectangle {

	public double width;
	public double heigth;
	
	public double Area() {
		return width * heigth;
	}
	
	public double Perimeter() {
		return (width * 2) + (heigth * 2);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}
	
}
