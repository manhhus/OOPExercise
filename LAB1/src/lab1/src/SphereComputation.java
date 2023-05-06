package lab1.src;

import java.util.Scanner;

public class SphereComputation {
	public static void main(String[] args) {

		double radius;
		double surfaceArea;
		double volume;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = in.nextDouble();
		in.close();
		surfaceArea = 4 * Math.PI * radius * radius;
		volume = (double) 4 / 3 * Math.PI * radius * radius * radius;
		// phai ep kieu double vi phep chia so nguyen ra so nguyen
		System.out.printf("SurfaceArea is: %.2f", surfaceArea);
		System.out.printf("\nVolume is: %.2f", volume);

	}

}
