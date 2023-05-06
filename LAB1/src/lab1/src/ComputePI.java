package lab1.src;

import java.util.Scanner;

public class ComputePI {
	public static void main(String[] args) {

		computerPI1();
		computerPI2();
	}

	static void computerPI1() {

		Scanner sc = new Scanner(System.in);
		System.out.printf("MAX DENOMINATOR of:  ");
		double MAX_DENOMINATOR = sc.nextDouble();
		double sum = 0.0;
		for (double i = 1; i <= MAX_DENOMINATOR; i += 2) {
			if (i % 4 == 1) {
				sum += 1 / i;
			} else if (i % 4 == 3) {
				sum -= 1 / i;
			} else
				System.out.println("Impossible!!!");

		}
		sc.close();
		double pi = 4 * sum;
		System.out.println("Pi bang : " + pi);
		// 2.3 try 2
		System.out.println("Phan tram Math.PI bang : " + (pi / Math.PI) * 100);

	}

	static void computerPI2() {
		int MAX_TERM = 1000;
		double sum = 0.0;
		for (int term = 1; term <= MAX_TERM; term++) {
			if (term % 2 == 1) {
				sum += 1.0 / (term * 2 - 1);
			} else
				sum -= 1.0 / (term * 2 - 1);
		}
		double pi = 4 * sum;
		System.out.println("Pi bang : " + pi);
		// 2.3 try 2
		System.out.println("Phan tram Math.PI bang : " + (pi / Math.PI) * 100);

	}

}
