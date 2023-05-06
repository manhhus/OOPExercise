package hw5.src.cylinder2;

public class TestMain {
    public static void main(String[] args)  {
        Cylinder[] cylinders = {new Cylinder(), new Cylinder(10.0), new Cylinder(2.0, 10.0)};
        
        for(Cylinder c : cylinders) {  
            System.out.println(c);
            System.out.println("Cylinder: "
                    + " radius=" + c.getRadius()
                    + " height=" + c.getHeight()
                    + " base area=" + c.getArea()
                    + " volume=" + c.getVolume());
        }
    }
}