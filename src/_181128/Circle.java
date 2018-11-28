package _181128;

public class Circle {
	private double radius;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
