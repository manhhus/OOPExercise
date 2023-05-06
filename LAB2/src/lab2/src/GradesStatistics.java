package lab2.src;

import java.util.Scanner;

public class GradesStatistics {
	public static void main(String[] args) {
		double min;
		double max;
		int sum = 0;
		double average;
		final int numStudents;
		int[] items;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();
		items = new int[numStudents];
		if (numStudents > 0) {
			for (int i = 0; i < numStudents; ++i) {
				System.out.print("Enter the grade for student (of int between 0 and 100) " + (i + 1) + ": ");
				items[i] = in.nextInt();
				while ((items[i] < 0) || (items[i] > 100)) {
					System.out.print("Enter the grade for student (of int between 0 and 100) " + (i + 1) + ": ");
					items[i] = in.nextInt();
				}
			}
		}
		in.close();
		min = items[0];
		max = items[0];
		for (int i = 0; i < numStudents; ++i) {
			sum += items[i];
			if (min > items[i]) {
				min = items[i];
			}
			if (max < items[i]) {
				max = items[i];
			}
		}
		average = (double) sum / numStudents;
		System.out.println("The average is: " + average);
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);

	}

}
