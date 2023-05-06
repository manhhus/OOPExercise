package hw5.src.cylinder;

public class TestMain {
	   public static void main(String[] args) {
	      Cylinder cy1 = new Cylinder();

	      System.out.println("Cylinder: radius is " + cy1.getRadius()
	         + ", height is " + cy1.getHeight()
	         + ", color is " + cy1.getColor()
	         + ", base area is " + cy1.getArea()
	         + ", volume is " + cy1.getVolume());
	      
	      Cylinder cy2 = new Cylinder(10.0);

	      System.out.println("Cylinder: radius is " + cy2.getRadius()
	         + ", height is " + cy2.getHeight()
	         + ", color is " + cy2.getColor()
	         + ", base area is " + cy2.getArea()
	         + ", volume is " + cy2.getVolume());

	      Cylinder cy3 = new Cylinder(2.0, 10.0, "blue");

	      System.out.println("Cylinder: radius is " + cy3.getRadius()
	         + ", height is " + cy3.getHeight()
	         + ", color is " + cy3.getColor()
	         + ", base area is " + cy3.getArea()
	         + ", volume is " + cy3.getVolume());
	      
	      Cylinder cy4 = new Cylinder(2.0, 10.0);
	      System.out.println(cy4);
	   }
	}