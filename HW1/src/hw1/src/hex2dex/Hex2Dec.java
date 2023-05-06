package hw1.src.hex2dex;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		String hexCode = "0123456789abcdef";
		int num = 0;
		boolean tag = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal: ");
		String inStr = input.next().toLowerCase();
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			int n = hexCode.indexOf(inStr.charAt(charIdx));
			if (n == -1) {
				tag = false;
				break;
			}
			num = num * 16 + n;			
		}
		if (tag) {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, num);
		} else {
			System.out.printf("error: invalid hexadecimal string \"%s\"", inStr);
		}
		input.close();
	}

}
