package lab1.src;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		
		int inDigit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int inNumber = sc.nextInt();
		sc.close();
		
		System.out.print("The reverse is: ");		
		while (inNumber > 0) {
			inDigit = inNumber % 10;
			System.out.print(inDigit);
			inNumber /= 10;
		}
		
	}

}
