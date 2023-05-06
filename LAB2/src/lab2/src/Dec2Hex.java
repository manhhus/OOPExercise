package lab2.src;

import java.util.Scanner;

public class Dec2Hex {
	final static char[] decHexs = { '0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static void main(String[] args) {
		
		int rem;
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal string: ");
		int dec_num = sc.nextInt();
		while (dec_num > 0) {
			rem = dec_num % 16;
			dec_num = dec_num / 16;
			str = decHexs[rem] + str;

		}
		System.out.print("The equivalent hexadecimal number is: " + str + "\n");
		sc.close();
	}

}
