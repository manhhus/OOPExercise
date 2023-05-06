package lab2.src;

public class SwapArray {

	public static void printInt(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] array1 = { -1, 2, 5, 8 };
		int[] array2 = { 5, -16, 7, 31 };
		System.out.println("Array 1:");
		printInt(array1);
		System.out.println("Array 2:");
		printInt(array2);
		swap(array1, array2);
	}

	public static void swap(int[] array1, int[] array2) {
		if ((array1 == null) || (array2 == null) || array1.length != array2.length) {
			return;
		}
		int temp;
		
		for (int i = 0; i < array1.length; i++) {
			temp = array1[i];
			array1[i] = array2[i];
			array2[i] = temp;
		}
		System.out.println("Array 1 after swap:");
		printInt(array1);
		System.out.println("Array 2 after swap:");
		printInt(array2);
		
	}
}
