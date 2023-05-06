package hw2.src;

public class SelectionSort {
		
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
	
	public static void selectionSort(int[] array) {
		int temp;
		int minidx;
		for (int i = 0; i < array.length; i++) {
			minidx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minidx]) {
					minidx = j;
				}
			}
			temp = array[minidx];
			array[minidx] = array[i];
			array[i] = temp;
		}
		printArr(array);
    
	}

	public static void main(String[] args) {
		
		int[] arr = { 3, 4, 1, 2, 6, 5 };
		System.out.print("Initial array: ");
        printArr(arr);
    
		System.out.print("\nSorted array: ");
		selectionSort(arr);

	}

}
