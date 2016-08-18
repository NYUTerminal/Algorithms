package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		int[] nums = {0,0,0};
		int target =0;
		FourSum fs = new FourSum();
		fs.fourSum(nums, target);
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		// -2 -1 0 0 1 2
		// -3 -2 -2 -1 0
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int tempTarget = target - (nums[i] + nums[j]);
				List<Integer> result = helper(nums, i, j, tempTarget);
				if (!result.isEmpty()) {
					result.add(nums[i]);
					result.add(nums[j]);
					Collections.sort(result);
					finalList.add(result);
				}
			}
		}
		return finalList;
	}

	private List<Integer> helper(int[] nums, int i, int j, int target) {
		List<Integer> result = new ArrayList<Integer>();
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			if (start == i || start == j) {
				start++;
				continue;
			}
			if (end == i || end == j) {
				end--;
				continue;
			}
			int tempTarget = nums[start] + nums[end];
			if (tempTarget > target) {
				start++;
			} else if (tempTarget < target) {
				end--;
			} else {
				result.add(nums[start]);
				result.add(nums[end]);
				break;
			}
		}
		return result;
	}
}
