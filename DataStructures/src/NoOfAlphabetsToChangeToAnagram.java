import java.util.HashMap;

public class NoOfAlphabetsToChangeToAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Character,Integer> charCount1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> charCount2 = new HashMap<Character,Integer>();
       
        
        
    }
    
    private static int numberOfAlphabetFlip(String input,HashMap map1,HashMap map2){
    	int length = input.length();
		if(length%2==1){
    		//Odd number of characters.
    		return -1;
    	}
    	for(int i=0;i<length;i++){
    		//map1.add(input.charAt(i));
    	}
    	
    	
    	
    	return -1;
    }
}