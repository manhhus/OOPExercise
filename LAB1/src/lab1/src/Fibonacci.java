package lab1.src;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		System.out.print("The first " + nMax + " Fibonacci number are: 1 1 ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			sum += fn;
			++n;
			System.out.print(fn + " ");
			fnMinus1 = fnMinus2;
			fnMinus2 = fn;
		}

		average = (double) sum / nMax;
		System.out.println("\nThe average is " + average);
	}

}
