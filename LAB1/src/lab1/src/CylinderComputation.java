package lab1.src;

import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		
		double radius;
        double height;
        double volume;
        double surfaceArea;
        double baseArea;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        System.out.print("Enter the height: ");
        height = in.nextDouble();
        in.close();
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height; 
       
        System.out.printf("BaseArea is: %.2f%n" , baseArea);
        System.out.printf("SurfaceArea is: %.2f%n" , surfaceArea);
        System.out.printf("Volume is: %.2f%n" , volume);
	}

}
