package hw2.src;

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		
		final int SECRET_NUMBER = (int) (Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("java NumberGuess");
		System.out.println("Key in your guess: ");
		int trials = 0;  //solanthunghiem
		while (true) {
			int trialNumber = (sc.hasNextInt()) ? sc.nextInt() : -1;
			trials++;

			if (SECRET_NUMBER == trialNumber) {
				System.out.println("You got it in " + trials + " trials!");
				break;
			} else if (SECRET_NUMBER > trialNumber) {
				System.out.printf("Try higher\n");
			} else {
				System.out.printf("Try lower\n");
			}

		}
		sc.close();
	}

}
