package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = scanner.nextLine();
		
		System.out.println("Gross salary: ");
		employee.grossSalary = scanner.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = scanner.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		double percentage = scanner.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		
		scanner.close();
		
		System.out.println();
	}

}
