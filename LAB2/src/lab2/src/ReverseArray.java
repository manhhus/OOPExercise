package lab2.src;

public class ReverseArray {

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

	public static int[] reverse(int[] array) {
		if (array == null) {
			return null;
		}
		int[] arrayReverse = new int[array.length];
		for (int fIdx = 0, bIdx = array.length - 1; fIdx <= bIdx; ++fIdx, --bIdx) {
			arrayReverse[fIdx] = array[bIdx];
			arrayReverse[bIdx] = array[fIdx];
		}
		return arrayReverse;
	}

	public static void main(String[] args) {
		int[] array = { -1, 2, 5, 8, -6 };
		System.out.print("The reverse of " + arrayToString(array) + " is " + arrayToString(reverse(array)));
	}

}
