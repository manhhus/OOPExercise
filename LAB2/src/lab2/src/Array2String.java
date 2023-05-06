package lab2.src;

public class Array2String {
	public static String arrayToString(int[] array) {
        String toString = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                toString = toString + "[" + array[i];
            } else if (i == array.length - 1) {
                toString = toString + ", " + array[i] + "]";
            } else {
                toString = toString + ", " + array[i];
            }
        }
        return toString;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        System.out.println("array: " + arrayToString(array));
    }
}
