package leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StringParseWithBuffer {
	// This is the text editor interface. 
	// Anything you type or change here will be seen by the other person in real time.

	    public static void main(String[] args){
	    	StringParseWithBuffer c = new StringParseWithBuffer();
	        List<String> result = c.parse("da");
	        for(String s: result){
	            System.out.println(s);
	        }
	    }
	    
	    private List<String> parse(String s){
	        s="one two thre four five";
	        int k = 5;
	        int i=0;
	        List<String> stringList = new ArrayList<String>();
	        while(i<=s.length()-k){
	            StringBuffer sb = new StringBuffer();
	            char[] subString = new char[k];
	            int len= 0;
	            int j =0;
	            while( i<s.length() && s.charAt(i) == ' '){
	            	i++;
	            }
	            while(j<k && j<s.length()){
	                if(s.charAt(i+j) == ' '){
	                    len = j;
	                }
	                sb.append(s.charAt(i+j));
	                j++;
	            }
	           if(len==0){
	        	   len = k;
	           }
	           stringList.add(sb.toString().substring(0,len)); 
	           i = i+len;
	        }
	        return stringList;
	    }
}
