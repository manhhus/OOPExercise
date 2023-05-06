package lab2.src;

public class ContainsArray {
	public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int key = 3;
        System.out.println(contains(array, key));
    }

    public static boolean contains(int[] array, int key) {
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            check = (array[i] == key) ? true : false;
            if (check) {
                break;
            }
        }
        return check;
    }
}
