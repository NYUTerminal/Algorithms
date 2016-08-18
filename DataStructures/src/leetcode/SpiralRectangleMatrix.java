package leetcode;
import java.util.ArrayList;
import java.util.List;

public class SpiralRectangleMatrix {

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		SpiralRectangleMatrix sp = new SpiralRectangleMatrix();
		sp.spiralOrder(input);
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int rotations = Math.min(m, n);
		List<Integer> result = new ArrayList<Integer>();
		if (m == 1 && n == 1) {
			result.add(matrix[0][0]);
			return result;
		}
		for (int i = 0; i <rotations / 2; i++) {
			// top row left to right
			for (int j = i; j < n - 1 - i; j++) {
				result.add(matrix[i][j]);
			}
			// right col top to bottom
			for (int j = i; j < m - 1 - i; j++) {
				result.add(matrix[j][n - 1 + i]);
			}
			// bottom from right to left
			for (int j = n - 1 - i; j > i; j--) {
				result.add(matrix[n - 1][j]);
			}
			// left bottom to up
			for (int j = m - 1 - i; j >i; j--) {
				result.add(matrix[j][i]);
			}
		}
		if(m%2==1){
			int index =0;
			int loop = n-2*(rotations/2);
			while(index<=loop){
				result.add(matrix[m/2+1][loop]);
				index++;
			}
		}
		return result;
	}
}
