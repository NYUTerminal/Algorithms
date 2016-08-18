package leetcode;

public class LongestIncreasingSubSequece {
	public static void main(String[] args) {
		//int[] nums = { 3, 4, -1, 5, 8, 2, 3, 12, 7, 9, 10 };
		int[] nums = {2,2};
		int val = new LongestIncreasingSubSequece().lengthOfLIS(nums);
		System.out.println("test");
	}

	public int lengthOfLIS(int[] nums) {

		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int[] index = new int[nums.length];
		// int[] longestSeq = new int[nums.length];
		int length = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index[0]] > nums[i]) {
				index[0] = i;
				// longestSeq[0] = length;
			} else if (nums[i] > nums[index[length]]) {
				length++;
				index[length] = i;
				// longestSeq[i] = length;
			} else {
				int j = ceilIndex(i, 0, length, index, nums);
				index[j] = i;
			}
		}
		return length + 1;
	}

	private int findIndexPos(int i, int start, int end, int[] index, int[] nums) {
		while (start < end) {
			int mid = (start + end) / 2;
			if (nums[index[mid]] < nums[i]) {
				start = mid + 1;
			} else if (nums[index[mid]] > nums[i]) {
				end = mid;
			}
		}
		return end;
	}
	
	 private int ceilIndex( int s ,int start ,int end,int T[],int input[]){
	        int middle;
	        int len = end;
	        while(start <= end){
	            middle = (start + end)/2;
	            if(middle < len && input[T[middle]] < s && s <= input[T[middle+1]]){
	                return middle+1;
	            }else if(input[T[middle]] < s){
	                start = middle+1;
	            }else{
	                end = middle-1;
	            }
	        }
	        return -1;
	    }
}
