package lab1.src;

import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		
		int numberIn;
		boolean isValid = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Enter a number between 0-10 or 90-100: ");
			numberIn = sc.nextInt();

			if (numberIn > 0 && numberIn < 10 || numberIn > 90 && numberIn < 100) {
				isValid = true;
			} else
				System.out.println("Invaild input, try again...");

		} while (!isValid);
		System.out.println("You have entered: " + numberIn);
		sc.close();
	}
	
}
