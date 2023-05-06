package hw1.src.exchangecipher;

import java.util.Scanner;

public class ExchangeCipher {
	public static void main(String[] args) {

		String text;
		int strLength;
		char cipheredChar;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter a plaintext string: ");
			text = in.next().toUpperCase();
		} while (!text.matches("[a-zA-Z]+"));
		strLength = text.length();
		System.out.print("The ciphered string is: ");
		for (int index = 0; index < strLength; index++) {
			cipheredChar = (char) (90 - (text.charAt(index) - 65));
			System.out.print(cipheredChar);
		}
		
		in.close();
	}

}
