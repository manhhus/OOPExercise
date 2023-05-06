package hw6.src.movable;

public class TestMovable {
    public static void main(String[] args)  {
    	Movable point = new MovablePoint(5, 6, 10, 11);
		System.out.println(point);
		point.moveDown();
		System.out.println(point);
		point.moveUp();
		System.out.println(point);
		point.moveLeft();
		System.out.println(point);
		point.moveRight();
		System.out.println(point);
     
		Movable circle = new MovableCircle(2, 1, 2, 20, 5);
		System.out.println(circle);
		circle.moveDown();
		System.out.println(circle);
		circle.moveUp();
		System.out.println(circle);
		circle.moveLeft();
		System.out.println(circle);
		circle.moveRight();
		System.out.println(circle);
      
        Movable rectangle = new MovableRectangle(7, 2, 3, 4, 2, 5);
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}