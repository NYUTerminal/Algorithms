package leetcode;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
	public static void main(String[] args) {
		CombinationSum3 cs = new CombinationSum3();
		cs.combinationSum3(2,18);
	}
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        comb(k,n,new int[k],result,0,k);
        return result;
    }
    
    
    private void comb(int k, int n ,int[] arr,List<List<Integer>> result,int start,int kMax){
        if(k==0){
            List<Integer> list = new ArrayList<Integer>();
            int sum = 0;
            for(int i =0;i<arr.length;i++){
                list.add(arr[i]);
                sum+=arr[i];
            }
            if(sum == n){
                result.add(list);
            }
            return;
        }
        for(int i=start;i<9;i++){
             arr[kMax-k] = i+1;
             comb(k-1,n,arr,result,i+1,kMax);
        }
        for(int i=start;i<9;i++){
            arr[kMax-k] = i+1;
            comb(k-1,n,arr,result,i+1,kMax);
       }
    }
}
