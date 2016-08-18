package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// 
public class Dibs {

	public static void main(String[] args) {
		Map<String,List<String>> ticketsHash = new HashMap<String,List<String>>();
		for(List<String> val : ticketsHash.values()){
			
		}
	}
	
	private boolean anagrams(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
//		NlogN solution
		
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		for(int i=0;i<chars1.length;i++){
		
		}
		List<Person> pList = new ArrayList<Person>();
		Collections.sort(pList,new MyComparator());
		HashMap<Character,Integer> cache = new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++){
			if(cache.get(s1.charAt(i))==null){
				cache.put(s1.charAt(i), 1);
			}else{
				cache.put(s1.charAt(i), cache.get(s1.charAt(i)+1));
			}
		}
		for(int i=0;i<s2.)
		return false;
	}
	
	
	
}

class MyComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2){
		return -1;
	}
}