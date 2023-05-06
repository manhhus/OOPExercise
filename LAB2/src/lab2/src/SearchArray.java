package lab2.src;

public class SearchArray {
	
	public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int key = 5;
        System.out.println(search(array, key));
    }

    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            result = (array[i] == key) ? i : -1;
            if (result != -1) {
                break;
            }
        }
        return result;
    }
}
