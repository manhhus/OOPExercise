package lab1.src;

import java.util.Scanner;

public class ExtractDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("The number: ");
		int number = sc.nextInt();
		System.out.print("ExtractDigit: ");
		while (number > 0) {
			int digit = number % 10;
			System.out.print(digit + " ");
			number = number / 10;
		}
		sc.close();
	}

}
