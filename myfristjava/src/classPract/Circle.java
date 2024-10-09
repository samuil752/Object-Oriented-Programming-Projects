package classPract;
import java.lang.Math;

public class Circle {
	public double radius = 1; //Data/fields/attributes
	
	public Circle() { //constructor with no arguments
	}
	
	public Circle(double radius) { //constructor
		this.radius = radius;
	}
	
	public double getArea() { //getter method (function)
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() { //getter method (function)
		return 2 * Math.PI * radius;
	}
	
	public double getRadius() { //getter method (function)
		return radius;
	}
	
	public void setRadius(double radius) { //setter method (no return value) (procedure)
		this.radius = radius;
	}
	
	public void print(double area, double perimeter, double radius) {
		System.out.println(String.format("area:%.4f, perimeter:%.4f, radius:%.4f", area, perimeter, radius));
	}	
}
