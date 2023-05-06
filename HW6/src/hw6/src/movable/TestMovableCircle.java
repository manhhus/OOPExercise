package hw6.src.movable;

public class TestMovableCircle {
	public static void main(String[] args) {
		Movable circle = new MovableCircle(1, 5, 6, 7, 8);
		System.out.println(circle);
		circle.moveDown();
		System.out.println(circle);
		circle.moveUp();
		System.out.println(circle);
		circle.moveLeft();
		System.out.println(circle);
		circle.moveRight();
		System.out.println(circle);
	}
}