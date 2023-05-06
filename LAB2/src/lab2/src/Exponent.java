package lab2.src;

import java.util.Scanner;

public class Exponent {
	public static void main(String[] args) {
		int exp;
		int base;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		base = sc.nextInt();
		System.out.print("Enter the exponent: ");
		exp = sc.nextInt();
		System.out.println(base + " raises to the power of " + exp + " is: " + computeExponent(base, exp));
		sc.close();
	}

	public static int computeExponent(int base, int exp) {
		
		int product = 1;
		for (int i = 1; i <= exp; i++) {
			product *= base;
		}

		return product;
	}

}
