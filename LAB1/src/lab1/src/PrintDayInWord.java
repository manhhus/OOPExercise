package lab1.src;

import java.util.Scanner;

public class PrintDayInWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the daynumber: ");
		int dayNumber = sc.nextInt();
		nested_if(dayNumber);
		useSwitchCase(dayNumber);
		sc.close();
	}

	static void nested_if(int dayNumber) {
		String dayStr = null;
		if (0 == dayNumber) {
			dayStr = "Sunday";
		} else if (1 == dayNumber) {
			dayStr = "Monday";
		} else if (2 == dayNumber) {
			dayStr = "Tuesday";
		} else if (3 == dayNumber) {
			dayStr = "Wednesday";
		} else if (4 == dayNumber) {
			dayStr = "Thursday";
		} else if (5 == dayNumber) {
			dayStr = "Friday";
		} else if (6 == dayNumber) {
			dayStr = "Saturday";
		} else {
			dayStr = "Not a valid day";
		}
		System.out.println("(a) Use a \"nested-if\" statement: " + dayStr);
	}

	static void useSwitchCase(int dayNumber) {
		String dayStr = null;
		switch (dayNumber) {
		case 0:
			dayStr = "Sunday";
			break;
		case 1:
			dayStr = "Monday";
			break;
		case 2:
			dayStr = "Tuesday";
			break;
		case 3:
			dayStr = "Wednesday";
			break;
		case 4:
			dayStr = "Thursday";
			break;
		case 5:
			dayStr = "Friday";
			break;
		case 6:
			dayStr = "Saturday";
			break;
		default:
			dayStr = "Not a valid day";
			break;
		}
		System.out.println("(b) Use a \"switch-case\" statement:" + dayStr);
	}

}
