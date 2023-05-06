package hw2.src;

public class LinearSearch {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 9 };
		int key1 = 4;
		int key2 = 9;

		System.out.println("Array has key 1: " + linearSeach(array, key1));
		System.out.println("Array has key 2: " + linearSeach(array, key2));

		System.out.println("Index of key 1 in array: " + (linearSearchIndex(array, key1)));
		System.out.println("Index of key 2 in array: " + (linearSearchIndex(array, key2)));
	}

	public static boolean linearSeach(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearchIndex(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

}
