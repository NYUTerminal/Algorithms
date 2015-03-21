import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String readInput() {
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			return in.nextLine();
		} finally {
			if (in != null)
				in.close();
		}
	}

	public static void main(String[] args) {
		int a[] = { 0, 3, 8 };
		int b[] = { 1, 4, 7 };
		int c[] = { 2, 5, 6 };
		int t[] = merge(a, b, c);
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
	}

	private static int[] toIntArray(String[] a) {
		int result[] = new int[a.length];
		for (int i = 0; i < a.length; i++)
			result[i] = Integer.parseInt(a[i]);
		return result;
	}

	public static int[] merge(int sortedA[], int sortedB[], int sortedC[]) {

		int totalLength = sortedA.length + sortedB.length + sortedC.length;
		int result[] = new int[totalLength];
		int i = 0;
		int j = 0, k = 0, l = 0;

		while (i < totalLength) {

			if (j < sortedA.length && k < sortedB.length && l < sortedC.length)
				result[i++] = sortedA[j] <= sortedB[k] ? sortedA[j] <= sortedC[l] ? sortedA[j++]
						: sortedC[l++]
						: sortedB[k] <= sortedC[l] ? sortedB[k++]
								: sortedC[l++];

			else if (j < sortedA.length && k < sortedB.length)
				result[i++] = sortedA[j] <= sortedB[k] ? sortedA[j++]
						: sortedB[k++];
			else if (l < sortedC.length && k < sortedB.length)
				result[i++] = sortedC[l] <= sortedB[k] ? sortedC[l++]
						: sortedB[k++];
			else if (j < sortedA.length && l < sortedC.length)
				result[i++] = sortedA[j] <= sortedC[l] ? sortedA[j++]
						: sortedC[l++];
			else if (j < sortedA.length)
				result[i++] = sortedA[j++];
			else if (k < sortedB.length)
				result[i++] = sortedB[k++];
			else if (l < sortedC.length)
				result[i++] = sortedC[l++];
			else
				break;

		}

		return result;
	}
}