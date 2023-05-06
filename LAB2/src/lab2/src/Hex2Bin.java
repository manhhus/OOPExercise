package lab2.src;

import java.util.Scanner;

public class Hex2Bin {
	static final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
    static final String HEX_CHAR = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String inHex = sc.nextLine().toUpperCase();

        if (!isHex(inHex)) {
            System.out.print("Invalid Input");
        } else {
            System.out.print("The equivalent binary for hexadecimal " + inHex + " is:");
            for (int i = 0; i < inHex.length(); ++i) {
                char hexChar = inHex.charAt(i);
                int binStIndex = HEX_CHAR.indexOf(hexChar);
                System.out.print(" " + HEX_BITS[binStIndex]);
            }
        }
        sc.close();
    }

    static boolean isHex(String str) {
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
