package hw1.src.triangularpatternx;

import java.util.Scanner;

public class TriangularPatternX {
	public static void triangularPatternA(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row >= col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void triangularPatternB(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row + col <= size + 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void triangularPatternC(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row <= col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void triangularPatternD(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row + col >= size + 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		triangularPatternA(size);
		triangularPatternB(size);
		triangularPatternC(size);
		triangularPatternD(size);
		sc.close();

	}

}
