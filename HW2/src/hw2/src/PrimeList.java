package hw2.src;

import java.util.Scanner;

public class PrimeList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the upper bound: ");
		int upperBound = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= upperBound; i++) {
			if (!isPrime(i)) {
				continue;
			}
			System.out.print(i + " ");
			count++;
		}
		System.out.printf("\n[%1$d primes found (%2$.2f%%)]\n", count, ((double) 100 * count / upperBound));
		sc.close();
	}

	public static boolean isPrime(int aPosInt) {
		if (aPosInt <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
			if (aPosInt % i != 0) {
				continue;
			}
			return false;
		}
		return true;
	}

}
