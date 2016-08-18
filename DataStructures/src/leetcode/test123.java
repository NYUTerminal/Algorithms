package leetcode;
import java.util.Arrays;
import java.util.HashMap;

public class test123 {
	public static void main(String[] args) {
////		int[] nums = {200, 100, 70, 130, 100, 800, 810}
//		/* xxxxxx                                   
//		xxx/*yyyyy**/ a = b; /*xxxx
//		x= y /*this is comment///*/ z=m /*something else*/
		
		String[] source = {"/* xxxxxx",                                   
				"xxx/*yyyyy**/ a = b; /*xxxx",
				"x= y /*this is comment///*/ z=m /*something else*/"
		                   };
		shortestSolutionLength(source);
	}
	static int shortestSolutionLength(String[] source) {
	    int length =0;
	    boolean commentOpened = false;
	    for(String string : source){
	        char[] stringArray = string.toCharArray();
	         removeComments(stringArray,commentOpened);
	         removeBackSlashes(stringArray,commentOpened);
	         
	         //TODO Inline Comments.
	         for(int i=0;i<stringArray.length;i++){
	            if(i+1 < stringArray.length && stringArray[i]=='/' && stringArray[i+1]== '*'){
	              commentOpened =true;
	                i = i + 2;
	            }
	            if(commentOpened && i < stringArray.length && i+1 < stringArray.length && stringArray[i]=='*' && stringArray[i+1]== '/'){
	                commentOpened =false;
	                i = i + 2;
	            }
	            if(!commentOpened && i<stringArray.length && stringArray[i]!=' '){
	                length++;
	            }
	        }
	    }
	    return length;
	}

	private static void removeBackSlashes(char[] stringArray , boolean commentOpened){
	    for(int i=0;i<stringArray.length;i++){
	            if(stringArray[i]=='/' && i+1<stringArray.length && stringArray[i+1]=='/'){
	                while(i<stringArray.length){
	                    if(commentOpened && i+1<stringArray.length && stringArray[i]!='*' && stringArray[i+1]!='/'){
	                    	stringArray[i]= ' ';
	                    }
	                    	
	                    i++;
	                }
	                return;
	               }
	    }

	}

	private static void removeComments(char[] stringArray,boolean commentOpened){
	    int start = 0 ;
	    int end = 0;
	    boolean flag = false;
	    for(int i=0;i<stringArray.length;i++){
	         if(!flag && i+1 < stringArray.length && stringArray[i]=='/' && stringArray[i+1]== '*' && i-1 >0 && stringArray[i-1]!='/' && !commentOpened){
	             start = i;
	             i = i+2;
	             flag = true;
	         }
	        if(flag && i+1 < stringArray.length && stringArray[i]=='*' && stringArray[i+1]== '/'){
	            i = i+1;
	            end = i;
	        }
	    }
	    
	    if(start !=0 && end !=0){
	         for(int i=0;i<stringArray.length;i++){
	             if(i>=start && i<=end)
	             stringArray[i] = ' ';
	         }
	    }

	}
}
