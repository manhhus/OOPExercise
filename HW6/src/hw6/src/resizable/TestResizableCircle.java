package hw6.src.resizable;

public class TestResizableCircle {
	public static void main(String[] args) {
		GeometricObject resizableCircle = new ResizableCricle(5);
		System.out.println(resizableCircle);
		System.out.println(resizableCircle.getArea());
		System.out.println(resizableCircle.getPerimeter());
		
		((ResizableCricle) resizableCircle).resize(80);
		System.out.println(resizableCircle);
		System.out.println(resizableCircle.getArea());
		System.out.println(resizableCircle.getPerimeter());
		  
	}
}
