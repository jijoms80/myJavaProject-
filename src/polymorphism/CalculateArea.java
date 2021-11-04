package polymorphism;

public class CalculateArea {
	double area;

	public double area(double length, double bredth) {
		area = length * bredth;
		return area;
	}
	
	
	public double area(double radius) {
		area=3.14*radius*radius;
		return area;
		
	}

}
