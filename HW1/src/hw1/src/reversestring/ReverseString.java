package hw1.src.reversestring;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine().toLowerCase();
		int i = str.length();
		System.out.print("Reverse String: ");
		while (i > 0) {
			System.out.print(str.charAt(i - 1));
			i--;
		}
		sc.close();
	}


}
