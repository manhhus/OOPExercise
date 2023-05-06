package hw2.src;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int temp;
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; ++i) {
				if (array[i - 1] > array[i]) {
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			n--;
		} while (swapped);
		printArr(array);

	}

	public static void printArr(int[] array) {
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
		int[] arr = { 3, 4, 1, 2, 6, 5 };
		System.out.print("Initial array: ");
		printArr(arr);
		System.out.print("\nSorted array: ");
		bubbleSort(arr);

	}

}
