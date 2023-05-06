package hw1.src.caesarcode;

import java.util.Scanner;

public class CaesarCode {
	public static void main(String[] args) {

		String text;
		int strLength;
		char testChar;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		text = in.next().toUpperCase();
		strLength = text.length();
		System.out.print("The ciphertext string is: ");
		for (int i = 0; i < strLength; i++) {
			testChar = text.charAt(i);
			if (testChar >= 'A' && testChar <= 'W') {
				testChar += 3;
			} else if (testChar >= 'X' && testChar <= 'Z') {
				testChar -= 23;
			} else {
				System.out.print("Error");
			}
			System.out.print(testChar);
		}
		in.close();
	}

}
