package hw2.src;

import java.util.Scanner;

public class FactorialInt {
	public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Nhập n: ");
        int n = input.nextInt();
        input.close();
        int factorial = factorial(n);
        System.out.println("Factorial(" + n + ") = " + factorial);
    }
}
