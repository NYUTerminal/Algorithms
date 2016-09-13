package misc;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = { -1, 5, -3, 4, 7, -2, 1, -5, -3, 4 };
		System.out.println(new ThreeSum().threeSum(arr));
	}

	private boolean threeSum(int[] arr) {
		Arrays.sort(arr);
		if (arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			int a = arr[i];
			while (j < k) {
				int sum = a + arr[j] + arr[k];
				if (sum == 0) {
					System.out.println(i + " " + j + " " + " " + k);
					return true;
				} else if (sum > 0) {
					k -= 1;
				} else {
					j += 1;
				}
			}
		}
		return false;
	}

}
