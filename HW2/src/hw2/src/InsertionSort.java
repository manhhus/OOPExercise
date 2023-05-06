package hw2.src;

public class InsertionSort {
	public static void insertionSort(int[] array) {

		int length = array.length;

		for (int i = 1; i < length; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}

			array[j + 1] = key;
		}
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

		int[] array = { 3, 4, 1, 2, 6, 5 };

		System.out.print("Initial array: ");
		printArr(array);

		System.out.print("\nSorted array: ");
		insertionSort(array);
	}

}
