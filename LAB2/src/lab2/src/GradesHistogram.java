package lab2.src;

import java.util.Scanner;

public class GradesHistogram {

	public static int[] grades;
	public static int[] bins = new int[10];

    public static void main(String[] args) {
        
        readGrades();
        computeHistogram();
        printHistogramHorizontal();
        printHistogramVertical();
        
    }

    public static void readGrades() {
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        grades = new int[numStudents];
        if (numStudents > 0) {
            for (int i = 0; i < numStudents; ++i) {
                System.out.print("Enter the grade for student (of int between 0 and 100) " + (i + 1) + ": ");
                grades[i] = in.nextInt();
                while ((grades[i] < 0) || (grades[i] > 100)) {
                    System.out.print("Enter the grade for student (of int between 0 and 100) " + (i + 1) + ": ");
                    grades[i] = in.nextInt();
                }
            }
        }
        in.close();
    }

    public static void computeHistogram() {
        for (int i = 0; i < grades.length; i++) {
            int j = (grades[i] == 100) ? 9 : grades[i] / 10;
            bins[j] += 1;
        }
    }

    public static void printHistogramHorizontal() {
    	
        System.out.println();
        for (int i = 0; i < bins.length; i++) {
            int delta = (i == bins.length - 1) ? 10 : 9;
            System.out.printf("%2d -%3d:", (i * 10), (i * 10 + delta));
            for (int j = 0; j < bins[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printHistogramVertical() {
    	
        int maxBin = bins[0];
        for (int i = 0; i < bins.length; i++) {
            maxBin = (bins[i] > maxBin) ? bins[i] : maxBin;
        }
        System.out.println();
        
        for (int i = maxBin; i >= 0; i--) {
            if (i == 0) {
                for (int j = 0; j < bins.length; j++) {
                    int delta = (j == bins.length - 1) ? 10 : 9;
                    System.out.printf("%2d-%-2d ", (j * 10), (j * 10 + delta));
                }
            } else {
                for (int j = 0; j < bins.length; j++) {
                    String str = (bins[j] < i) ? " " : "*";
                    System.out.printf("%3s%-2s ", str, " ");
                }
            }
            System.out.println();
        }
    }

}