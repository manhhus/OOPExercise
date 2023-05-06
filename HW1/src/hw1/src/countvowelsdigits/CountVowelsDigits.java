package hw1.src.countvowelsdigits;

import java.util.Scanner;

public class CountVowelsDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = sc.nextLine().toLowerCase();
		vowels(str);
		digits(str);
		sc.close();
	}

	public static void vowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		double percent = ((double) count / str.length()) * 100;
		percent = Math.round(percent * 100.0) / 100.0;
		System.out.println("Number of vowels: " + count + " (" + percent + "%)");

	}

	public static void digits(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
			}
		}
		double percent = ((double) count / str.length()) * 100;
		percent = Math.round(percent * 100.0) / 100.0;
		System.out.println("Number of digits: " + count + " (" + percent + "%)");
	}

}
