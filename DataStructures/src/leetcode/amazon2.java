package leetcode;
import java.util.Scanner;

public class amazon2 {
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int matrixSize = Integer.valueOf(in.next());
		// // int
		// for (int i = 0; i < matrixSize; i++) {
		//
		// }

		// int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13,14,15,16 } };
		new amazon2().rotateArr(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

	private void rotateArr(int[][] matrix) {
		// int i = arr.length/2;
		int n = matrix.length;
		int temp = 0;
		for (int i = 0; i < n / 2; i++) {
			temp = matrix[i][i];
			for (int j = i+1; j < n - i - 1; j++) {
				int current = matrix[i][j];
				matrix[i][j] = temp;
				temp = current;
			}
			// right col top to bottom
			for (int j = i; j < n - i - 1; j++) {
				int current = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
				temp = current;
			}
			// bottom from right to left
			for (int j = n - i - 1; j > i; j--) {
				int current = matrix[n - i - 1][j];
				matrix[n - i - 1][j] = temp;
				temp = current;
			}
			// left bottom to up
			for (int j = n - i - 1; j >= i; j--) {
				int current = matrix[j][i];
				matrix[j][i] = temp;
				temp = current;
			}
		}
	}

}
