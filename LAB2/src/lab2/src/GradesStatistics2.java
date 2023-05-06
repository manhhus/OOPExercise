package lab2.src;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics2 {
	public static String arrayToString(int[] array) {
		String toString = "";
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				toString = toString + "[" + array[i];
			} else if (i == array.length - 1) {
				toString = toString + ", " + array[i] + "]";
			} else {
				toString = toString + ", " + array[i];
			}
		}
		return toString;
	}

	static int[] grades;

	public static void readGrades() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = in.nextInt();
		grades = new int[numStudents];
		if (numStudents > 0) {
			for (int i = 0; i < numStudents; ++i) {
				System.out.print("Enter the grade for student " + (i + 1) + " (of int between 0 and 100): ");
				grades[i] = in.nextInt();
				while ((grades[i] < 0) || (grades[i] > 100)) {
					System.out.print("Enter the grade for student " + (i + 1) + " (of int between 0 and 100): ");
					grades[i] = in.nextInt();
				}
			}
		}
		in.close();
	}

	public static double average(int[] grades) {
		double average;
		int sum = 0;
		for (int i = 0; i < grades.length; ++i) {
			sum += grades[i];
		}
		average = (double) sum / grades.length;
		return average;
	}
	
	public static double median(int[] grades) {
		Arrays.sort(grades);
		double median;
		if ((grades.length % 2) == 0) {
			median = (double) (grades[(grades.length / 2) - 1] + grades[(grades.length / 2)]) / 2;
		} else {
			median = grades[grades.length / 2];
		}
		return median;
	}

	public static int max(int[] grades) {
		int max;
		max = grades[0];
		for (int i = 0; i < grades.length; ++i) {
			if (max < grades[i]) {
				max = grades[i];
			}
		}
		return max;
	}

	public static int min(int[] grades) {
		int min;
		min = grades[0];
		for (int i = 0; i < grades.length; ++i) {
			if (min > grades[i]) {
				min = grades[i];
			}
		}
		return min;
	}

	public static double stdDev(int[] grades) {
		double std;
		double sum_std = 0;
		for (int i = 0; i < grades.length; i++) {
			sum_std += grades[i] * grades[i] - average(grades) * average(grades);
		}
		std = Math.sqrt(sum_std / grades.length);
		return std;
	}

	public static void main(String[] args) {
		readGrades();
		System.out.println("The grades are: " + arrayToString(grades));
		System.out.printf("\nThe average is: %.2f", average(grades));
		System.out.printf("\nThe median is: %.2f", median(grades));
		System.out.println("The minimum is: " + min(grades));
		System.out.println("The maximum is: " + max(grades));
		System.out.printf("\nThe standard deviation is: %.2f", stdDev(grades));

	}
}
