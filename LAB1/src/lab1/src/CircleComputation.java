package lab1.src;

import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {
		
		double radius;
        double diameter;
        double circumference;
        double area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        in.close();
        
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f", diameter);
        System.out.printf("\nArea is: %.2f", area);
        System.out.printf("\nCircumference is: %.2f", circumference);

	}

}
