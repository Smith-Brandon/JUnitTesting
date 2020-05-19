package junitTest;
import java.util.Scanner;

public class WinCalc {

	public static void main(String[] args) {
		// Declare Variables
		double length;
		double height;
		double radius;
		double base;

		// Ask user if making a rectangular window
		System.out.println("Enter a rectangular window Y | N");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		// Check user input to start rectangle calculations
		if (input.contains("Y") || input.contains("y")) {
			// Get user variables
			System.out.println("Enter the length of the desired window");
			length = scanner.nextDouble();
			System.out.println("Enter the height of the desired window");
			height = scanner.nextDouble();
			// Call method
			double window = calcRect(length, height);
			// Print the resulting area
			System.out.println("The window area is: " + window);
		}
		
		
		// Ask user if making a circular window
		System.out.println("Enter a Circle window Y | N");
		input = scanner.nextLine();
		
		// Check user input to start circle calculations
		if (input.contains("Y") || input.contains("y")) {
			// Get user variable
			System.out.println("Enter the radius of the desired window");
			radius = scanner.nextDouble();
			// Call method
			double window = calcCirc(radius);
			// Print the resulting area
			System.out.println("The window area is " + window);
		}
		
		
		
		
		// Ask user if making a triangular window
		System.out.println("Enter a triangle window Y | N");
		input = scanner.nextLine();
		
		// Check user input to start triangle calculations
		if (input.contains("Y") || input.contains("y")) {
			// Get user variables
			System.out.println("Enter the length of the desired window");
			base = scanner.nextDouble();
			System.out.println("Enter the height of the desired window");
			height = scanner.nextDouble();
			// Call method
			double window = calcTri(base, height);
			// Print the resulting area
			System.out.println("The window area is " + window);
		} else {
			// If user reaches this point there are no more options
			System.out.println("No more options please start again :D");
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
