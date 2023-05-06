package hw3.src.mypoint_shapes;

public class TestMyRectangle {

	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(3, 2);
		MyPoint point2 = new MyPoint(-1, 5);
		
		MyRectangle rectangle1 = new MyRectangle(point1, point2);
		System.out.println(rectangle1);
		System.out.println("area is: " + rectangle1.getArea());
		System.out.println("perimeter is: " + rectangle1.getPerimeter());

		MyRectangle rectangle2 = new MyRectangle(3, 2, -1, 5);
		System.out.println(rectangle2);
		System.out.println("area is: " + rectangle2.getArea());
		System.out.println("perimeter is: " + rectangle2.getPerimeter());
	}

}
