package hw2.src;

import java.util.Scanner;

public class NumberConversion {
	static final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rem;
		String str = "";
		String in;
		do {
			System.out.print("Enter a number and radix: ");
			in = sc.nextLine();
		} while (!in.matches("[a-zA-Z0-9]+"));
		
		System.out.print("Enter the input radix: ");
		int inRadix = sc.nextInt();
		System.out.print("Enter the output radix: ");
		int outRadix = sc.nextInt();
		
		int toDec = Integer.parseInt(in, inRadix);	
		while (toDec > 0) {
			rem = toDec % outRadix;
			toDec = toDec / outRadix;
			str = alphabet.charAt(rem) + str;
		}
		System.out.println(in + " in radix " + inRadix + " is "  + str + " in radix " + outRadix);
		sc.close();
	}

}
