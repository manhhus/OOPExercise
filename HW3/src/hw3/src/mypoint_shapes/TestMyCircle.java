package hw3.src.mypoint_shapes;

public class TestMyCircle {
	public static void main(String[] args) {

		MyPoint point = new MyPoint(6, 6);
		MyCircle circle1 = new MyCircle(point, 3);
		System.out.println(circle1);
		System.out.println("area is: " + circle1.getArea());
		System.out.println("circumference is: " + circle1.getCircumference());

		MyCircle circle2 = new MyCircle(3, 12, 2);
		System.out.println(circle2);
		System.out.println("distance is: " + circle2.distance(circle1));
	}

}
