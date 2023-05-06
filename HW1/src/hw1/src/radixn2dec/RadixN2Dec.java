package hw1.src.radixn2dec;

import java.util.Scanner;

public class RadixN2Dec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String str;
        int radix;
        int toDec;
        System.out.print("Enter the radix: ");
        radix = in.nextInt();
        System.out.print("Enter the string: ");
        str = in.next();
        toDec = Integer.parseInt(str, radix);
        System.out.println("The equivalent decimal number " + "\"" + str + "\"" + " is: " + toDec);
        in.close();
	}

}