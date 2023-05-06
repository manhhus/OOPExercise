package hw1.src.checkhexstr;

import java.util.Scanner;

public class CheckHexStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter is string: ");
		String str = sc.nextLine();
		if (!(isHex(str))) {
			System.out.println(str + " is a hex string");
		} else {
			System.out.println(str + " is NOT a hex string");
		}
		sc.close();
	}

	public static boolean isHex(String str) {
		for (int i = 0; i < str.length(); i++) {
			char inChar = str.charAt(i);
			if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'a' && inChar <= 'f')
					|| (inChar >= 'A' && inChar <= 'F'))) {
				return true;
			}

		}
		return false;
	}
}
