package lab1.src;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("The number is: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		System.out.println("Bye!");
		sc.close();

	}

}
