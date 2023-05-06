package hw1.src.deciphercaesarcode;

import java.util.Scanner;

public class DecipherCaesarCode {
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
            if (testChar >= 'D' && testChar <= 'Z') {
                testChar -= 3;
            } else if (testChar >= 'A' && testChar <= 'C') {
                testChar += 23;
            } else {
                System.out.print("Error");
            }
            System.out.print(testChar);
        }
		in.close();
	}

}
