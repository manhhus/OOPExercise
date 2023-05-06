package lab1.src;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		sumAvg();
		SumAge2();
		Sumodd_even();
		Sum_squares();

	}

	static void sumAvg() {
		int sum = 0, count = 0;
		double average;
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
			sum += i;
			count++;
		}
		average = sum / (double) (count);
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);

	}

	static void whiledo_SumAvg() {
		int sum = 0;
		int count = 0;
		double average;
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum += number;
			number++;
			count++;
		}
		average = sum / (double) (count);
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}

	static void Dowhile_Sumavg() {
		int sum = 0;
		int count = 0;
		double average;
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		int number = LOWERBOUND;
		do {
			sum += number;
			number++;
			count++;
		} while (number <= UPPERBOUND);
		average = sum / (double) (count);
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}

	static void SumAge2() {
		int sum = 0, count = 0;
		double average;
		int LOWERBOUND = 111;
		int UPPERBOUND = 8899;
		for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
			sum += i;
			count++;
		}
		average = sum / (double) (count);
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}

	static void Sumodd_even() {
		int sumOdd = 0, sumEven = 0;
		int absDiff;
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		if (sumOdd > sumEven)
			absDiff = sumOdd - sumEven;
		else
			absDiff = sumEven - sumOdd;

		System.out.println("Sum of odd numbers " + sumOdd);
		System.out.println("Sum of even numbers " + sumEven);
		System.out.println("computer their absolute difference " + absDiff);

	}

	static void Sum_squares() {
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		int sum_squares = 0;
		for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
			sum_squares += i * i;
		}
		System.out.println("The sum of squares 1 to 100: " + sum_squares);
	}

}
