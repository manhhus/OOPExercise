package hw2.src;


public class Matrix {
	public static void main(String[] args) {
		
		int[][] matrix1 = { { 3, 5, 1, 7 }, { 9, 11, 5, 4 }, { 6, 0, 13, 17 }, { 7, 21, 14, 15 } };
		int[][] matrix2 = { { 4, 3, 6, 8 }, { 9, 11, 5, 4 }, { 6, 0, 13, 17 }, { 7, 21, 14, 15 } };
		
		int[][] matrix3 = { { 4, 3, 2 }, { 9, 11, 5 }, { 6, 0, 13 }, { 6, 0, 13 } };
		double[][] matrix4 = { { 3.3, 2, 1, 7 }, { 9, 11, 5, 4 }, { 6, 0, 13, 17 }, { 7, 21, 14, 15 } };
		
		double[][] matrix5 = { { 4.3, 3, 2, 8 }, { 9, 11, 5, 4 }, { 6, 0, 13, 17 }, { 7, 21, 14, 15 } };
		double[][] matrix6 = { { 4.5, 3, 2 }, { 9, 11, 5 }, { 6, 0, 13 }, { 6, 0, 13 } };

		int[][] sumOfMatrix = add(matrix1, matrix2);
		int[][] subtractOfMatrix = subtract(matrix1, matrix2);
		int[][] productOfMatrix = multiply(matrix1, matrix3);

		print(sumOfMatrix);
		System.out.println();
		print(subtractOfMatrix);
		System.out.println();
		print(productOfMatrix);
		System.out.println();
		
		double[][] doubleSumOfMatrix = add(matrix4, matrix5);
		double[][] doublesubtractOfMatrix = subtract(matrix4, matrix5);
		double[][] doubleProductOfMatrix = multiply(matrix4, matrix6);
		System.out.println();
		print(doubleSumOfMatrix);
		System.out.println();
		print(doublesubtractOfMatrix);
		System.out.println();
		print(doubleProductOfMatrix);

	}

	public static void print(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	public static void print(double[][] matrix) {

		for (double[] row : matrix) {
			for (double element : row) {
				System.out.printf("%.2f\t", element);
			}
			System.out.println();
		}
	}

	public static boolean isNull(int[][] matrix) {

		return matrix == null;
	}

	public static boolean isNull(double[][] matrix) {

		return matrix == null;
	}

	public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {

		if (isNull(matrix1) || isNull(matrix2)) {
			return false;
		}
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {

		if (isNull(matrix1) || isNull(matrix2)) {
			return false;
		}
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			return true;
		} else {
			return false;
		}

	}

	public static int[][] add(int[][] matrix1, int[][] matrix2) {
		if (!haveSameDimension(matrix1, matrix2)) {
			return null;
		}
		int[][] result = new int[matrix1.length][matrix1[0].length];
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				result[row][col] = matrix1[row][col] + matrix2[row][col];
			}
		}

		return result;

	}

	public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
		if (!haveSameDimension(matrix1, matrix2)) {
			return null;
		}
		int[][] result = new int[matrix1.length][matrix1[0].length];
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				result[row][col] = matrix1[row][col] - matrix2[row][col];
			}
		}

		return result;

	}

	public static double[][] add(double[][] matrix1, double[][] matrix2) {
		if (!haveSameDimension(matrix1, matrix2)) {
			return null;
		}
		double[][] result = new double[matrix1.length][matrix1[0].length];
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				result[row][col] = matrix1[row][col] + matrix2[row][col];
			}
		}

		return result;
	}

	public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
		if (!haveSameDimension(matrix1, matrix2)) {
			return null;
		}
		double[][] result = new double[matrix1.length][matrix1[0].length];
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				result[row][col] = matrix1[row][col] - matrix2[row][col];
			}
		}

		return result;
	}

	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		if (isNull(matrix1) || isNull(matrix2)) {
			return null;
		}

		if (matrix1[0].length != matrix2.length) {
			return null;
		}
		int[][] result = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < matrix1[0].length; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}

	public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		if (isNull(matrix1) || isNull(matrix2)) {
			return null;
		}

		if (matrix1[0].length != matrix2.length) {
			return null;
		}
		double[][] result = new double[matrix1.length][matrix2[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < matrix1[0].length; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}


}
