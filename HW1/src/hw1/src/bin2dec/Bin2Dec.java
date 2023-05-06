package hw1.src.bin2dec;

import java.util.Scanner;

public class Bin2Dec {
	
	public static void main(String[] args) {
		String binCode = "01";
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean tag = true;
		System.out.print("Enter a binary string: ");
		String str = in.next().toLowerCase();
		for (int charIdx = 0; charIdx < str.length(); charIdx++) {
			int n = binCode.indexOf(str.charAt(charIdx));
			if (n == -1) {
				tag = false;
				break;
			}
			num = num * 2 + n;
		}
		if (tag) {
			System.out.printf("The equivalent decimal number for binary \"%s\" is: %d", str, num);
		} else {
			System.out.printf("error: invalid binary string \"%s\"", str);
		}
		
		in.close();
    
	}
	
}


