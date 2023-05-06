package hw3.src.mypoint_shapes;

public class MyRectangle {
	private final MyPoint topLeft;
    private final MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2,y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public String toString() {
        return "MyRectangle[topLeft = " + topLeft + ", bottomRight = " + bottomRight + "]";
    }

    public double getPerimeter() {
        int length = Math.abs(topLeft.getX() - bottomRight.getX());
        int width = Math.abs(topLeft.getY() - bottomRight.getY());
        return 2 * (length + width);
    }

    public double getArea() {
        int length = Math.abs(topLeft.getX() - bottomRight.getX());
        int width = Math.abs(topLeft.getY() - bottomRight.getY());
        return length * width;
    }

}
