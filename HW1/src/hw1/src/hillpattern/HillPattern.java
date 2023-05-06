package hw1.src.hillpattern;

import java.util.Scanner;

public class HillPattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the size: ");
		int size = sc.nextInt();
		hillPatternA(size);
		hillPatternB(size);
		hillPatternC(size);
		hillPatternD(size);
		sc.close();
	}

	public static void hillPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int size) {
        for (int row = 1; row <= 2 * size - 1; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1) && (col >= row - size + 1)
                        && (col >= row - size + 1) && (col + row <= 3 * size - 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int size) {
        for (int row = 1; row <= 2 * size - 1; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row <= 2 * size) && (col <= 2 * size)) {
                    if ((row + col <= 3 * size - 2) && (row + col >= size + 2) && (col >= row - size + 2)
                            && (row >= col - size + 2)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
                    }
                }
            }
            System.out.println();
        }
    }
}
