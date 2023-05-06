package hw2.src;

import java.util.Scanner;

public class FibonacciInt {

	public static int fibonacci(int n) {
		if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Nhập n: ");
        int n = input.nextInt();
        input.close();
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
