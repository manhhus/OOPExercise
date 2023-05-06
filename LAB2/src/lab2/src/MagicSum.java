package lab2.src;

import java.util.Scanner;

public class MagicSum {
	public static void main(String[] args) {
		
		final int SENTINEL = -1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a postive integer (or -1 to end): ");
		int number = sc.nextInt();
		while (number != SENTINEL) {
			if (hasEight(number)) {
				sum += number;
			}
			System.out.print("Enter a postive integer (or -1 to end): ");
			number = sc.nextInt();

		}

		System.out.print("The magic sum is: " + sum);
		sc.close();

	}

	public static boolean hasEight(int number) {
		number = Math.abs(number);
		while (number > 0) {
			if (number % 10 == 8)
				return true;

			number = number / 10;
		}
		return false;
	}

}
