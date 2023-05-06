package hw1.src.squarepattern;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the size: ");
		int size = sc.nextInt();
		squarePattern1(size);
		System.out.println();
		squarePattern2(size);
		sc.close();
	}

	public static void squarePattern1(int size) {
    for (int row = 1; row <= size; row++) {
        for (int col = 1; col <= size; col++) {
            System.out.print("# ");
        }
        System.out.println();
    }
	}

// 1.1 try 1
	public static void squarePattern2(int size) {
		int i = 1;
		while (i <= size) {
			int j = 1;
			while (j <= size) {
				System.out.print("# ");
            	j++;
			}
			System.out.println();
			i++;
		}
	}
}
