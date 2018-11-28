package _181128;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		obj1.setRadius(2.0);
		obj1.setHeight(4.0);
		obj1.setColor("White");
		System.out.println("obj1");
		System.out.println("Radius : " + obj1.getRadius());
		System.out.println("Area : " + obj1.getArea());
		System.out.println("Height : " + obj1.getHeight());
		System.out.println("Volume : " + obj1.getVolume());
		System.out.println("Color : " + obj1.getColor());

		Cylinder obj2 = new Cylinder(5.0, 3.0);
		obj2.setColor("White");
		System.out.println("obj2");
		System.out.println("Radius : " + obj2.getRadius());
		System.out.println("Area : " + obj2.getArea());
		System.out.println("Height : " + obj2.getHeight());
		System.out.println("Volume : " + obj2.getVolume());
		System.out.println("Color : " + obj2.getColor());
	}

}
