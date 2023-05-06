package hw2.src;

import java.util.Scanner;

public class SpecialSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x: ");
		double x = sc.nextDouble();
		System.out.print("Enter the term: ");
		int term = sc.nextInt();
		System.out.println("Special series for x: " + specialSeries(x, term));
		sc.close();

	}

	public static double specialSeries(double x, int numTerms) {

		double sum = x;
		double result = x;
		for (int i = 1; i <= numTerms; i++) {
			sum = sum * (x * x) * (2 * i - 1) / (2 * i);
			result += sum / (2 * i + 1);
		}
		return result;

	}

}
