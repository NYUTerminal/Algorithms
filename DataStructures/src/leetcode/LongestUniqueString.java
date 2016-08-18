package leetcode;
import java.util.HashMap;
import java.util.Map;

public class LongestUniqueString {
	
	public static void main(String[] args) {
//		System.out.println(countNumPalindromes("wowpurerocks"));
	       int[] arr = {1,2,3,4,5};
	       System.out.println(5);
	       for(Integer i:arr){
	        System.out.print(i+" ");
	       }
	       System.out.println("\n"+4);
		new LongestUniqueString().lengthOfLongestSubstring("blqsearxxxbiwqa");
	}

    public int lengthOfLongestSubstring(String s) {
        //List<String> results = new ArrayList<String>();
        int maxLength = 0;
        Map<String, Integer> datamap = new HashMap<String, Integer>();
        int curLength = 0;
        int lastIndex = 0;
        
        for(int i=0; i < s.length(); i++){
            String curVal = Character.toString(s.charAt(i));
            
            if(datamap.containsKey(curVal)){
                int prev_index = datamap.get(curVal);
                if(curLength > maxLength){
                    maxLength = curLength;
                }
                if(prev_index<lastIndex){
                    curLength ++;
                }
                else{
                    curLength = i - prev_index;
                    lastIndex = prev_index;
                }
                
                
            }
            else{
                curLength ++;
            }
            
            datamap.put(curVal, i);
        }
        
        if(curLength > maxLength)
            maxLength = curLength;
        
        return maxLength;
    }
}
