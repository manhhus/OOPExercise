package hw2.src;

import java.util.Scanner;

public class PerfectPrimeFactorList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper bound: ");
		final int UPPER_BOUND = sc.nextInt();

		int count = 0;
		System.out.println("These numbers are equal to the product of prime factors: ");
		for (int i = 1; i <= UPPER_BOUND; i++) {
			if (isProductOfPrimeFactors(i)) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n[%d numbers are found (%.2f%%)]\n", count, (double) count * 100 / UPPER_BOUND);
		sc.close();
	}

	public static boolean isProductOfPrimeFactors(int aPosInt) {
		int res = 1;
		for (int i = 2; i <= aPosInt / 2; i++) {
			if (aPosInt % i == 0 && isPrime(i))
				res *= i;
		}
		return res == aPosInt;
	}

	public static boolean isPrime(int aPosInt) {
		if (aPosInt < 2)
			return false;
		else if (aPosInt == 2)
			return true;
		else {
			for (int i = 2; i < aPosInt; i++) {
				if (aPosInt % i == 0)
					return false;
			}
			return true;
		}
	}

}
