package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	// -4 -1 -1 0 1 2
	// 1
	public static void main(String[] args) {
		int[] nums = { 1, -1, -1, 0 };
		new ThreeSum().threeSum(nums);
	}

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length == 0 || nums.length < 3) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int a = nums[i];
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				if (nums[left] + nums[right] + a == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					result.add(list);
					left++;
					right--;
					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}
				} else if (nums[left] + nums[right]+a < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;
	}
}
