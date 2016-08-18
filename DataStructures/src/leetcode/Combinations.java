package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Combinations {
	    public List<List<Integer>> combine(int n, int k) {
	        List<List<Integer>> result = new ArrayList<List<Integer>> ();
	        helper(result, new ArrayList<Integer>(), n, k, 0);
	        ArrayList<Integer> ss = new ArrayList<Integer>(new ArrayList<Integer>());
	        return result;
	    }
	    private void helper(List<List<Integer>> result, ArrayList<Integer> list,int n, int k, int start){
	        if( k == 0){
	            result.add(new ArrayList<Integer>(list));
	            return;
	        }
	    
	        for (int i = start; i < n; i++){
	            list.add(i+1);
	            helper(result, list,n, k - 1,i + 1);
	            list.remove(list.size() - 1);
	        }
	    }
}
