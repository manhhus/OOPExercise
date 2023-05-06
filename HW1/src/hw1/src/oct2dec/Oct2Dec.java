package hw1.src.oct2dec;

import java.util.Scanner;

public class Oct2Dec {
	public static void main(String[] args) {
		String octCode = "01234567";
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean tag = true;
		System.out.print("Enter an octal string: ");
		String str = in.next().toLowerCase();
		for (int charIdx = 0; charIdx < str.length(); charIdx++) {
			int n = octCode.indexOf(str.charAt(charIdx));
			if (n == -1) {
				tag = false;
				break;
			}
			num = num * 8 + n;
		}
		if (tag) {
			System.out.printf("The equivalent decimal number for octal \"%s\" is: %d", str, num);
		} else {
			System.out.printf("error: invalid octal string \"%s\"", str);
		}
		
		in.close();
	}

}
