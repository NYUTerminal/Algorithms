package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsWithDuplicates {
	public static void main(String[] args) {
		SubSetsWithDuplicates sd = new SubSetsWithDuplicates();
		int[] nums = {1,2};
		sd.subsetsWithDup(nums);
	}
	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        List<List<Integer>> temp = new ArrayList<List<Integer>>();
	        for(int i =0;i<nums.length;i++){
	            if(res.isEmpty()){
	                List<Integer> sub = new ArrayList<Integer>();
	                sub.add(nums[i]);
	                res.add(sub);
	                temp.add(sub);
	            }else{
	                if(nums[i]==nums[i-1]){
	                    //temp
	                    List<List<Integer>> tempRep = new ArrayList<List<Integer>>();
	                    for(int j=0;j<temp.size();j++){
	                        List<Integer> newSub = new ArrayList<Integer>(temp.get(j));
	                        newSub.add(nums[i]);
	                        tempRep.add(newSub);
	                        res.add(newSub);
	                    }
	                    temp = tempRep;
	                }else{
	                    //temp
	                    temp = new ArrayList<List<Integer>>();
	                    for(int j=0;j<res.size();j++){
	                        List<Integer> newSub = new ArrayList<Integer>(res.get(j));
	                        newSub.add(nums[i]);
	                        res.add(newSub);
	                        temp.add(newSub);
	                    }
	                    List<Integer> newSub = new ArrayList<Integer>();
	                    newSub.add(nums[i]);
	                    res.add(newSub);
	                }
	            }
	        }
	        res.add(new ArrayList<Integer>());
	        return res;
	    }
}
