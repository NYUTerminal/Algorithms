package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDigitsToText {
	    private HashMap<Character,Character[]> dict = new HashMap<Character,Character[]>();
	    public List<String> letterCombinations(String digits) {
	        initDict();
	        List<String> comb = new ArrayList<String>();
	        for(Character c : digits.toCharArray()){
	            List<String> combTemp = new ArrayList<String>();
	            char[] arr = dict.get(c);
	            for(Character alp:arr){
	                for(int i=0;i<comb.size();i++){
	                    combTemp.add(comb.get(i)+(""+alp));
	                }
	            }
	            comb = combTemp;
	        }
	        return comb;
	    }
	    
	    private void initDict(){
	        dict.put('2',{'a','b','c'});
	        dict.put('3',{'d','e','f'});
	        dict.put('4',{'g','h','i'});
	        dict.put('5',{'j','k','l'});
	        dict.put('6',{'m','n','o'});
	        dict.put('7',{'p','q','r','s'});
	        dict.put('8',{'t','u','v'});
	        dict.put('9',{'w','x','y','z'});
	        dict.put('0',{' '});
	        // char[][] dict = new char[9][4];
	    }
}
