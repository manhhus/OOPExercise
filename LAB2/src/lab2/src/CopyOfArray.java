package lab2.src;

public class CopyOfArray {
	
	public static void main(String[] args) {
		
		int[] array1 = { 3, 4, 5, 4, 3 };;
        int[] array2 = { 1, 2, 3, 4, 5 };
        printInt(copyOf(array1));
        printInt(copyOfArray(array2, 6));
        
	}
	
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

    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static int[] copyOfArray(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        int[] arrayCopy = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i >= array.length) {
                arrayCopy[i] = 0;
            } else {
                arrayCopy[i] = array[i];
            }
        }
        return arrayCopy;
    }
}
