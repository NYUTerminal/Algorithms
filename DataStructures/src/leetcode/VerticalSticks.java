package leetcode;
import java.io.*;
import java.util.*;

public class VerticalSticks {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();

			int[] lines = new int[N];
			int counter = 0;
			for (int j = 0; j < N; j++) {
				lines[counter] = sc.nextInt();
				counter++;
			}
			/*
			 * for(String st: sc.nextLine().trim().split(" ")){ lines[counter] =
			 * Integer.parseInt(st); counter++; }
			 */

			counter = 0;

			List<List<Integer>> perms = new ArrayList<List<Integer>>();
			List<Integer> temp = new ArrayList<Integer>();

			computePermutations(perms, temp, lines, 0);

			int[] results = new int[perms.size()];

			for (List<Integer> list : perms) {
				results[counter] = getV(list);
			}

			int sum = 0;
			for (int val : results) {
				sum = sum + val;
			}

			double result = sum / results.length;
			result = Math.round(result * 100.0) / 100.0;

			System.out.println(result);
		}

		sc.close();
	}

	private static void computePermutations(List<List<Integer>> perms, List<Integer> temp, int[] lines, int start) {

		if (temp.size() == lines.length) {
			perms.add(new ArrayList<Integer>(temp));
			return;
		} else if (temp.size() < lines.length) {
			int value = lines[start];

			for (int i = 0; i <= temp.size(); i++) {
				List<Integer> copy = new ArrayList<Integer>(temp);
				copy.add(i, value);
				computePermutations(perms, copy, lines, start + 1);
			}
		}
	}
	
	
	private static void permutations(int[] lines,int pos){
		if (pos == lines.length) {
			//call to get V val;
			return;
		}
		// 1,2,3,4 => 
		for(int i=pos;i<lines.length;i++){
			int var = lines[i];
			lines[i] = lines[pos];
			lines[pos] = var;
			permutations(lines, i+1);
			var = lines[i];
			lines[i] = lines[pos];
			lines[pos] = var;
		}
		
		
		
		
	}

	private static int getV(List<Integer> list) {
		int maxIndex = 0, maxVal = 0;
		int[] rslt = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > maxVal) {
				rslt[i] = i + 1;
				maxIndex = i;
				maxVal = list.get(i);
			} else {
				rslt[i] = i - maxIndex;
			}
		}

		int sum = 0;

		for (int i : rslt) {
			sum = sum + i;
		}

		return sum;
	}
}