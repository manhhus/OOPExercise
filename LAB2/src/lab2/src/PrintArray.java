package lab2.src;

import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {

		final int NUM_ITEMS;
		int[] items;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		NUM_ITEMS = in.nextInt();
		items = new int[NUM_ITEMS];
		if (items.length > 0) {
			System.out.print("Enter the value of all items (separated by space): ");
			for (int i = 0; i < items.length; ++i) {
				items[i] = in.nextInt();
			}
		}
		System.out.print("The values are: ");
		for (int i = 0; i < items.length; ++i) {
			if (i == 0) {
				System.out.print("[" + items[i]);
			} else {
				System.out.print(", " + items[i]);
			}
		}
		System.out.print("]");

		in.close();
	}

}
