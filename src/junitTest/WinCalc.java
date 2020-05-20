package junitTest;
import java.util.Scanner;

public class WinCalc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare Variables
		double length;
		double height;
		double radius;
		double base;

		// Start Program on console 
		System.out.println("This is a basic program that calculates the area of 3 shapes \nThis is also just used as an example for a JUnit test\n");
		
		try {
		
		// Ask user if making a rectangular window
		System.out.println("Would you like to find the area of a rectangle Y | N");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		// Check user input to start rectangle calculations
		if (input.contains("Y") || input.contains("y")) {
			// Get user variables
			System.out.println("Enter the length of the rectangle");
			length = scanner.nextDouble();
			System.out.println("Enter the height of the rectangle");
			height = scanner.nextDouble();
			// Call method
			double window = calcRect(length, height);
			// Print the resulting area
			System.out.println("The area is: " + window);
			return;
		}
		else {
		// If user typed anything other than "Y" than the next option will start
		// Ask user if making a circular window
		System.out.println("Would you like to find the area of a Circle Y | N");
		}
		input = scanner.nextLine();
		
		// Check user input to start circle calculations
		if (input.contains("Y") || input.contains("y")) {
			// Get user variable
			System.out.println("Enter the radius of the circle");
			radius = scanner.nextDouble();
			// Call method
			double window = calcCirc(radius);
			// Print the resulting area
			System.out.println("The area is " + window);
			return;
		}
		else {
		// If user typed anything other than "Y" than the next option will start
		// Ask user if making a triangle
		System.out.println("Would you like to find the area of a triangle Y | N");
		}
		input = scanner.nextLine();
		
		// Check user input to start triangle calculations
		if (input.contains("Y") || input.contains("y")) {
			// Get user variables
			System.out.println("Enter the base length of the triangle");
			base = scanner.nextDouble();
			System.out.println("Enter the height of the triangle");
			height = scanner.nextDouble();
			// Call method
			double window = calcTri(base, height);
			// Print the resulting area
			System.out.println("The area is " + window);
			return;
		} else {
			// If user reaches this point there are no more options
			System.out.println("No more options please start again :D");
		}
		}catch(Exception e) {
			System.out.println("You can only enter numbers into this field!\nPlease exit and try again");
		}
		
		
	}

	// Calculations to be tested here
	public static double calcRect(double length, double height) {
		// Area calculations
		double area = length * height;
		// Round the result to .00
		area = area * 100;
		area = Math.round(area);
		area = area / 100;
		// Return area
		return area;
	}

	public static double calcCirc(double radius) {
		// Area calculations
		double area = Math.pow(radius, 2) * Math.PI;
		// Round the result to .00
		area = area * 100;
		area = Math.round(area);
		area = area / 100;
		// Return area
		return area;
	}

	public static double calcTri(double base, double height) {
		// Area calculations
		double area = (base * height) / 2;
		// Round the result to .00
		area = area * 100;
		area = Math.round(area);
		area = area / 100;
		// Return area
		return area;
	}
}
