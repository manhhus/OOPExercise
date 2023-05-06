package hw2.src;

import java.util.Scanner;

public class TrigonometricSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value: ");
		double x = sc.nextDouble();
		x = Math.PI/6;
		System.out.print("Enter the num terms: ");
		int numTerms = sc.nextInt();
		
		System.out.printf("Sin(%f) = %f\n", x, sin(x, numTerms));
		double sinDiff = Math.abs(Math.sin(x) - sin(x, numTerms));
		System.out.println("sinDiff = " + sinDiff);
		
		System.out.printf("Cos(%f) = %f\n", x, cos(x, numTerms));
		double cosDiff = Math.abs(Math.cos(x) - cos(x, numTerms));
		System.out.println("cosDiff = " + cosDiff);
		sc.close();
	}

	public static double sin(double x, int numTerms) {
		double result = 0;
		double part = 1;
		for (int i = 1; i <= numTerms; i++) {
			part *= (x / i);
			if (i % 4 == 1)
				result += part;
			if (i % 4 == 3)
				result -= part;
		}
		return result;
	}

	public static double cos(double x, int numTerms) {
		double result = 1;
		double part = 1;
		for (int i = 1; i <= numTerms; i++) {
			part *= (x / i);
			if (i % 4 == 0)
				result += part;
			if (i % 4 == 2)
				result -= part;
		}
		return result;

	}
}
