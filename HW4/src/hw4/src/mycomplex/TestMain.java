package hw4.src.mycomplex;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter complex number 1 (real and imaginary part): ");
		double inReal1 = sc.nextDouble();
		double inImag1 = sc.nextDouble();
		MyComplex complex1 = new MyComplex(inReal1, inImag1);
		
		System.out.print("Enter complex number 2 (real and imaginary part): ");
		double inReal2 = sc.nextDouble();
		double inImag2 = sc.nextDouble();
		MyComplex complex2 = new MyComplex(inReal2, inImag2);
		sc.close();
		
	    System.out.println("Number 1 is: " + complex1);
	    System.out.println("Modun 1 is: " + complex1.magnitude());
	    System.out.println(complex1 + " is " + (complex1.isReal() ? "" : "NOT") + " pure real number");
	    System.out.println(complex1 + " is " + (complex1.isImaginary() ? "" : "NOT") + " pure imaginary number");
	    
	    System.out.println("Number 2 is: " + complex2);
	    System.out.println(complex2 + " is " + (complex2.isReal() ? "" : "NOT") + " pure real number");
	    System.out.println(complex2 + " is " + (complex2.isImaginary() ? "" : "NOT") + " pure imaginary number");
	    
	    System.out.println(complex1 + " is " + (complex1.equals(complex2) ? "":"NOT") + " equal to " + complex2);
	    System.out.println(complex1 + " + " + complex2 + " = " + complex1.addInto(complex2));
	    
	}
}
