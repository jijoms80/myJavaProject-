package polymorphism;

import java.util.Scanner;

public class CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea calculateArea = new CalculateArea();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the shape you want to calculate");
		String shape = scan.next();
		if (shape.equalsIgnoreCase("Rectangle")) {
			System.out.println(" Enther the length");
			double length = scan.nextDouble();

			System.out.println("Enther the breadth");
			double breadth = scan.nextDouble();

			calculateArea.area(length, breadth);
			System.out.println("Area of the rectangle" + calculateArea.area);
		}

		else if (shape.equalsIgnoreCase("circle")) {
			System.out.println("Enter the radius");

			double radius = scan.nextDouble();
			calculateArea.area(radius);
			System.out.println(" Area of the circle" + calculateArea.area);

		}

		else
			System.out.println("Not a valid entery");
		scan.close();
	}

}
