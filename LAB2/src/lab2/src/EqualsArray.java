package lab2.src;

public class EqualsArray {
	public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        System.out.println(equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean check = false;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                check = (array1[i] == array2[i]) ? true : false;
                if (!check) {
                    break;
                }
            }
        }
        return check;
    }
}
