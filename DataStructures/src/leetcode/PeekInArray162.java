package leetcode;

public class PeekInArray162 {
	public static void main(String[] args) {
		
	}
	    public int findPeakElement(int[] nums) {
	        if(nums.length==0){
	            return 0;
	        }
	        return findPeak(nums , 0 , nums.length);
	    }
	// 4 5 6 7 8 3
	    private int findPeak(int[] nums , int start , int end){
	        if(start<end){
	            int mid = (start+end)/2;
	            int leftValue = 0;
	            int rightValue = 0;
	            if(mid-1==-1){
	                leftValue = -1;
	            }if(mid+1 == nums.length){
	                rightValue = Integer.MIN_VALUE;
	            }
	            if(nums[mid]>leftValue && nums[mid]>rightValue){
	                return nums[mid];
	            }else if(nums[mid]>leftValue){
	                return findPeak(nums,mid,end);
	            }else{
	                return findPeak(nums,start,mid);
	            }
	        }
	        return -1;
	    }
}
