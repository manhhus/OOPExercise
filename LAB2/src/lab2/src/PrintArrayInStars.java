package lab2.src;

import java.util.Scanner;

public class PrintArrayInStars {

	public static int[] inputArray(Scanner in) {
		final int NUM_ITEMS;
		int[] items;
		System.out.print("Enter the number of items: ");
		NUM_ITEMS = in.nextInt();
		items = new int[NUM_ITEMS];
		if (items.length > 0) {
			System.out.print("Enter the value of all items (separated by space): ");
			for (int i = 0; i < items.length; ++i) {
				items[i] = in.nextInt();
			}
		}
		return items;
	}

	public static void printStars(int[] items) {
		if (items == null) {
			System.out.println("Array null");
			return;
		}
		for (int idx = 0; idx < items.length; ++idx) {
			System.out.print(idx + ": ");
			for (int starNo = 1; starNo <= items[idx]; ++starNo) {
				System.out.print("*");
			}
			System.out.println("(" + items[idx] + ")");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr = null;
		arr = inputArray(in);
		printStars(arr);
		in.close();
	}

}
