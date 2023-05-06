package hw2.src;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = in.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = in.nextInt();
        in.close();
        int result = gcd(firstNum, secondNum);
        
        System.out.println("Greatest Common Divisor of 2 numbers is " + result);
        
	}

	public static int gcd(int a, int b) {
		int temp;

		if (a <= 0 || b <= 0) {
			return -1;
		}

		if (a < b) {
			temp = b;
			b = a;
			a = temp;
		}

		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

}





















