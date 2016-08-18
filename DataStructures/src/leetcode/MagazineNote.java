package leetcode;
import java.io.*;
import java.util.*;

public class MagazineNote {
	/* package whatever; // don't place package name! */

	public static void main(String[] args) throws java.lang.Exception {
		String magazines = "firstdibs";
		String note = "stirs";
		MagazineNote mg = new MagazineNote();
		System.out.println(mg.charsAvailable(magazines, note));
		List<String> test = new ArrayList<String>();
		test.add("gar");
		test.add("pet");
		test.add("apple");
		test.add("parse");
		Collections.sort(test,new MyComparator123());
		System.out.println(test);
	}

	// two String arguments: magazines, note
	// return boolean: can the text in note be composed from the characters
	// available in magazines
	// magazines="firstdibs" note="praveen", return false
	// magazines="firstdibs" note="stirs", return true
	// magazines="firstdibs" note="firstf", return false
	// 32 bit 11
	// input strings only contain lowercase alphabetic characters a-z

	// f 2
	// i 1
	// r 1
	//

	// length of magazine is m, length of note is n

	// O(M)
	// O(N)
	// O(N) memory
	// O(M) times.
	// O(M * N)
	private boolean charsAvailable(String magazine, String note) {
		if (magazine == null && note != null) {
			return false;
		}
		if (note == "" && magazine != null) {
			return true;
		}
		if (note.length() > magazine.length()) {
			return false;
		}
		HashMap<Character, Integer> cache = new HashMap<Character, Integer>();
		for (int i = 0; i < note.length(); i++) {
			if (cache.get(note.charAt(i)) == null) {
				cache.put(note.charAt(i), 1);
			} else {
				cache.put(note.charAt(i), cache.get(note.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < magazine.length(); i++) {
			if (cache.size() == 0) {
				return true;
			}
			if (cache.get(magazine.charAt(i)) != null) {
				int currentCount = cache.get(magazine.charAt(i));
				if (currentCount == 1) {
					cache.remove(magazine.charAt(i));
				} else {
					cache.put(magazine.charAt(i), currentCount - 1);
				}
			}
		}
		return cache.size() > 0 ? false : true;

	}
}

class MyComparator123 implements Comparator<String>{

@Override
public int compare(String s1,String s2){
return s1.compareTo(s2);
}

}
