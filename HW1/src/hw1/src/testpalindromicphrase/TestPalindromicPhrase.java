package hw1.src.testpalindromicphrase;

import java.util.Scanner;

public class TestPalindromicPhrase {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String textbefore = in.nextLine();
        String text = textbefore.toUpperCase();
        in.close();
        int strLength;
        strLength = text.length();
        int fIdx = 0;
        int bIdk = strLength - 1;
        char forChar = text.charAt(fIdx);
        char backChar = text.charAt(bIdk);
        boolean check = true;
        while (fIdx <= bIdk) {
            while (!Character.isLetter(forChar)) {
                fIdx++;
                forChar = text.charAt(fIdx);
            }
            while (!Character.isLetter(backChar)) {
                bIdk--;
                backChar = text.charAt(bIdk);
            }
            if (forChar != backChar) {
                check = false;
            }
            fIdx++;
            bIdk--;
        }
        if (check) {
            System.out.println(textbefore + " is a palindrome.");
        } else {
            System.out.println(textbefore + " is NOT a palindrome.");
        }
	}
}
