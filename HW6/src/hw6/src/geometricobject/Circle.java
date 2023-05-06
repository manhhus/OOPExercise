package hw6.src.geometricobject;

public class Circle implements GeometricObject {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle[" + "radius=" + radius + ']';
	}
}
