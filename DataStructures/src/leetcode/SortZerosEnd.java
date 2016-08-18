package leetcode;

public class SortZerosEnd {
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,0,12};
		moveZeroes(nums);
		Collections.sor
	}
	
	    public static void moveZeroes(int[] nums) {
	        int zero = 0;
	        int nonzero = 0;
	        while(zero < nums.length &&  nonzero < nums.length){
	            while(nums[zero]!=0){
	                zero++;
	            }
	            while(nums[nonzero]==0){
	                nonzero++;
	            }
	            if(zero<nonzero){
	                nums[zero] = nums[zero];
	                nums[zero] = 0;
	            }
	        }
	    }

}
