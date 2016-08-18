package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		Permutations p = new Permutations();
		int[] nums = {1,2,3,4};
		List<List<Integer>> res = p.permute(nums);
		System.out.println("end");
	}
	
	public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            return result;
        }
        return permUtil(nums,0,nums.length-1);
    }
    private static List<List<Integer>> result = new ArrayList<List<Integer>>();
    private static List<List<Integer>> permUtil(int[] nums , int start , int length){
        if(start == length){
            ArrayList<Integer> permutation = new ArrayList<Integer>();
            for(int i = 0;i<nums.length;i++){
                permutation.add(nums[i]);
            }
            result.add(permutation);
        }else{
            for(int i=start;i<=length;i++){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                permUtil(nums,start+1,length);
                int temp1 = nums[start];
                nums[start] = nums[i];
                nums[i] = temp1;
            }
        }
        return result;
    }
}
