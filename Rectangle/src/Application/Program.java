package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitties.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		Rectangle regtangle = new Rectangle();
		
		System.out.println("Enter the width: ");
		rectangle.width = scanner.nextDouble();

		System.out.println("Enter the heigth: ");
		rectangle.heigth = scanner.nextDouble();		

		System.out.println();
		System.out.printf("AREA: %.2f\n", rectangle.Area());
		System.out.printf("PERIMTER: %.2f\n", rectangle.Perimeter());
		System.out.printf("DIAGONAL: %.2fz\n", rectangle.Diagonal());
		
		scanner.close();
	}
}