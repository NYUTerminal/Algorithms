package leetcode;
import java.util.HashMap;

public class ValidStringOrNot {
	
	private PrefixTreeLookUp pl = new PrefixTreeLookUp();
	
	
	//IWorkatuber
	// I 
	// Work
	// a
	//tube
	
	public boolean isValid(String input , int start,int length){
		if(start>length){
			return false;
		}
		StringBuffer sb = new StringBuffer();
		for(int i=start;i<input.length();i++){
			sb.append(input.charAt(i));
			boolean isPrefix = pl.isPrefix(sb.toString());
			boolean isWord = pl.isWord(sb.toString());
			if(isWord && !isPrefix){
				return isValid(input , i+1,length);
			}
			if(isWord && isPrefix){
				isValid(input , i+1,length);
			}
		}
		return true;
	}
}


class PrefixTree{
	private PrefixTree[] nextChars;
	private HashMap<Character,PrefixTree> nextLinks;
	private char currChar;
	private boolean isEnd;
	
	public PrefixTree(char character ,boolean end){
		nextChars = new PrefixTree[26];
		currChar = character;
		isEnd = end;
		nextLinks = new HashMap<Character,PrefixTree>();
	}
}

class PrefixTreeLookUp{
	PrefixTree root;
	
	public PrefixTreeLookUp(){
		root = new PrefixTree('$',false);
	}
	
	public boolean isPrefix(String str){
		
		PrefixTree temp = null;
		for(int i=0;i<str.toCharArray().length;i++){
			
		}
		
		
		return false;
	}
	
	public boolean isWord(String str){
		
		return false;
	}
	
	public void addString(String s){
		
		
	}
}

interface xx{
	public void getPrice();
}

interface yy extends xx{
	
}