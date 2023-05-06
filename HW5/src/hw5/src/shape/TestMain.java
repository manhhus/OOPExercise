package hw5.src.shape;


public class TestMain {

    public static void main(String[] args) {   	
         
        Shape s1 = new Circle(5.5, "RED", false);  
        System.out.println(s1);                    
//        System.out.println(s1.getArea());         
//        System.out.println(s1.getPerimeter());     
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        
        Shape s2 = new Shape();
        System.out.println(s2);
       
        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false);   
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Square s4 = new Square(6.6);
        s4.setLength(3);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());     

    }

}