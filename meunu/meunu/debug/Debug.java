package meunu.debug;

public class Debug {

	public static void main(String[] args) {

		int num;
		for (int i = 0; i < 5; i++) {
			num = i * i + 1;
			displayNum(num);
		}
		
	}
	
	private static void displayNum(int num) {
		
		if (num % 2 != 0) {
			System.out.printf("%d là số chẵn\n", num);
		}
		else {
			System.out.printf("%d là số lẻ\n", num);
		}
	}
	
}
