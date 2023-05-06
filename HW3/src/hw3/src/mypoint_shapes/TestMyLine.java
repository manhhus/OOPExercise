package hw3.src.mypoint_shapes;

public class TestMyLine {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(1, 2);
		MyPoint point2 = new MyPoint(3, 4);

		MyLine line1 = new MyLine(point1, point2);
		System.out.println(line1);
		line1.setBeginXY(6, 8);
		System.out.println(line1);
		System.out.println("length is: " + line1.getLength());
		System.out.println("gradient is: " + line1.getGradient());

		MyLine line2 = new MyLine(4, 5, 7, 8);
		System.out.println(line2);
	}

}
