package hw1.src.phonekeypad;

import java.util.Scanner;

public class PhoneKey_Pad {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a String: ");
		String str = sc.next().toLowerCase();
		System.out.print("Enter a String nestedIf: ");
		nestedIf(str);
		System.out.print("\nEnter a String swtichCase: ");
		switchCase(str);
		sc.close();
	}

	public static void nestedIf(String str) {
		int digit = 0;

		for (int i = 0; i < str.length(); i++) {
			char inChar = str.charAt(i);
			if (inChar == 'a' || inChar == 'b' || inChar == 'c') {
				digit = 2;
			} else if (inChar == 'd' || inChar == 'e' || inChar == 'f') {
				digit = 3;
			} else if (inChar == 'g' || inChar == 'h' || inChar == 'i') {
				digit = 4;
			} else if (inChar == 'j' || inChar == 'k' || inChar == 'l') {
				digit = 5;
			} else if (inChar == 'm' || inChar == 'n' || inChar == 'o') {
				digit = 6;
			} else if (inChar == 'p' || inChar == 'q' || inChar == 'r' || inChar == 's') {
				digit = 7;
			} else if (inChar == 't' || inChar == 'u' || inChar == 'v') {
				digit = 8;
			} else if (inChar == 'w' || inChar == 'x' || inChar == 'y' || inChar == 'z') {
				digit = 9;
			} else
				System.out.print("Invaid Input!!!");
			System.out.print(digit);
		}
	}

	static void switchCase(String str) {
		int digit = 0;
		for (int i = 0; i < str.length(); i++) {
			char inChar = str.charAt(i);
			switch (inChar) {
			case 'a':
			case 'b':
			case 'c':
				digit = 2;
				break;
			case 'd':
			case 'e':
			case 'f':
				digit = 3;
				break;
			case 'g':
			case 'h':
			case 'i':
				digit = 4;
				break;
			case 'j':
			case 'k':
			case 'l':
				digit = 5;
				break;
			case 'm':
			case 'n':
			case 'o':
				digit = 6;
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				digit = 7;
				break;
			case 't':
			case 'u':
			case 'v':
				digit = 8;
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				digit = 9;
				break;
			default:
				System.out.print("Invaid Input!!!");
				break;
			}
			System.out.print(digit);
		}
	}

}
