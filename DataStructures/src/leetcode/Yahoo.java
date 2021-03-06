package leetcode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Yahoo {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String num = scanner.nextLine();
//		String[] split = num.split(" ");
//		System.out.println(new Yahoo().numberOfProblemsToSolve(Integer.valueOf(split[0]), Integer.valueOf(split[1]),
//				Integer.valueOf(split[2])));
//		
//		int[] arr = {2,3,10,2,4,8,1};
//		System.out.println(new Yahoo().maxDifference(arr));
//		Queue<String> queue = new LinkedList<String>();
//		Stack<String> stack = new Stack<String>();
//		stack.push("sol");
//		stack.pop();
//		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int low = 0 ;
		int high = 10;
		int rand = low + (int)(Math.random()*(high-low));
		System.out.println(rand);
	}

	private int numberOfProblemsToSolve(int A, int K, int P) {
		int days = 1;
		if (A > K) {
			return -1;
		}
		while (true) {
			int ashaProblems = A * days + P;
			int kelyProblems = K * days;
			if (kelyProblems > ashaProblems) {
				return days;
			}
			days++;
		}
	}

	private int maxDifference(int[] arr) {
		if (arr.length == 1) {
			return -1;
		}
		int i = 0, j = 1;
		int maxDiff = -1;
		// int diff = maxDiff;
		while (j < arr.length) {
			int diff = arr[j] - arr[i];
			if (diff > 0 && diff > maxDiff) {
				maxDiff = diff;
				j++;
			} else if (diff < maxDiff) {
				j++;
			} else {
				i = j;
				j = j + 1;
			}
		}
		return maxDiff;
	}

}
