package leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		int[] nums = { 3, 30, 34, 5, 9 };
		ln.largestNumber(nums);
	}

	public String largestNumber(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		Collections.sort(list, new MyCustComparator());
		return null;
	}
}

class MyCustComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer int1, Integer int2) {
		String s1 = String.valueOf(int1);
		String s2 = String.valueOf(int2);
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {
			int first = s1.charAt(i) - '0';
			int second = s2.charAt(j) - '0';
			if (first > second) {
				return 1;
			} else if (first < second) {
				return -1;
			} else {
				i++;
				j++;
			}
		}
		return 0;
	}

}
