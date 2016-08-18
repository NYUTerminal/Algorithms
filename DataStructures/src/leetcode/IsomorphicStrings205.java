package leetcode;

public class IsomorphicStrings205 {
	    public boolean isIsomorphic(String s, String t) {
	        if((s==null && t==null) || (s=="" && t=="")){
	            return true;
	        }
	        if(s.length() != t.length()){
	            return false;
	        }
	        if(s==null || t==null){
	            return false;
	        }
	        int diff = -1;
	        for(int i=0;i<s.length();i++){
	            if(diff==-1){
	                diff = s.charAt(i) - t.charAt(i);
	            }else{
	                if(s.charAt(i)-t.charAt(i)!=diff){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}
