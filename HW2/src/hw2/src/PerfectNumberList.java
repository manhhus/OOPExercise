package hw2.src;

import java.util.Scanner;

public class PerfectNumberList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        final int UPPER_BOUND = sc.nextInt();

        int countPer = 0;
        System.out.print("These numbers are perfect:");
        for (int i = 6; i <= UPPER_BOUND; i++) {
            if (isPerfect(i)) {
                countPer++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers are found (%.2f%%)]\n", countPer, (double) countPer * 100 / UPPER_BOUND);

        int countNone = 0;
        System.out.println("\nThere numbers are neither deficient nor perfect:");
        for (int i = 1; i <= UPPER_BOUND; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                countNone++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers are found (%.2f%%)]", countNone, (double) countNone * 100 / UPPER_BOUND);
        sc.close();
    }

    public static boolean isPerfect(int aPosInt) {
        int res = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0)
                res += i;
        }
        return (res == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int res = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0)
                res += i;
        }
        return (res < aPosInt);
    }


}
