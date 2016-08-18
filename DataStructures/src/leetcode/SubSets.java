package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
	
	public static void main(String[] args) {
		SubSets sb  = new SubSets();
		int[] nums = {1,2,0};
		sb.subsets(nums);
	}
	    public List<List<Integer>> subsets(int[] nums) {
	        
	        
	        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
	        List<Integer> empty = new ArrayList<Integer>();
	        // subsets.add(empty);
	        //  int[] sub = new int[nums.length];
	        // subsetHelper(nums , 0 , subsets,sub);
	        Arrays.sort(nums);
	        subsetHelper(nums , 0 , subsets,empty);
	        return subsets;
	         
	    }
	    
	    // private void subsetHelper(int[] nums , int start ,List<List<Integer>> subsets,int[] sub){
	    //     if(start<nums.length){
	    //         List<Integer> subList = new ArrayList<Integer>();
	    //         for(int i=0;i<sub.length;i++){
	    //             subList.add(sub[i]);
	    //         }
	    //         subsets.add(subList);
	    //     }else{
	    //         return;
	    //     }
	        
	    //     //       123
	    //     //       1
	    //     //
	    //     //
	    //     for(int i = start;i<nums.length;i++){
	    //         sub[start] = nums[i];
	    //         subsetHelper(nums ,start+1 ,subsets,sub);
	    //     }
	        
	    // }
	    
	     private void subsetHelper(int[] nums , int start ,List<List<Integer>> subsets,List<Integer> sub){
	        if(start==nums.length){
	            ArrayList<Integer> newList = new ArrayList<Integer>(sub);
	            subsets.add(newList);
	            return;
	        }
	        //       123
	        //       1
	        //
	        //
	            sub.add(nums[start]);
	            //sub[start] = nums[i];
	            subsetHelper(nums ,start+1 ,subsets,sub);
	            sub.remove(sub.size()-1);
	        return;
	    }
}
