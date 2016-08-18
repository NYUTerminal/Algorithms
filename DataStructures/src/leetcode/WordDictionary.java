package leetcode;
import java.util.*;

class WordDictionary12 {
	private Trie root;
	// Adds a word into the data structure.

	public WordDictionary12() {
		root = new Trie('$');
	}

	public void addWord(String word) {
		addWordUtil(word, root);
	}

	private void addWordUtil(String word, Trie root) {
		Trie temp = root;
		for (int i = 0; i < word.length(); i++) {
			if (temp.next.get(word.charAt(i)) != null) {
				temp = temp.next.get(word.charAt(i));
				if (i == word.length() - 1) {
					temp.setEnd();
				}
				continue;
			} else {
				Trie newNode = new Trie(word.charAt(i));
				if (i == word.length() - 1) {
					newNode.setEnd();
				}
				temp.next.put(word.charAt(i), newNode);
				temp = newNode;
			}
		}
	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	public boolean search(String word) {
		if (word == null) {
			return false;
		}
		return searchUtil(word, 0, root);
	}

	private boolean searchUtil(String word, int index, Trie temp) {
		if (index == word.length()) {
			return true;
		}
		if (temp.next.size() == 0) {
			return false;
		}

		if (word.charAt(index) == '.') {
			for (Trie value : temp.next.values()) {
				if (searchUtil(word, index + 1, value)) {
					return true;
				}
			}
		} 
			Trie trie = temp.next.get(word.charAt(index));
			if (trie.c != word.charAt(index)) {
				return false;
			} else {
				if(index == word.length()-1){
					return trie.isEnd;
				}
				return searchUtil(word, index + 1, trie);
			}
		//return false;
	}
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");

class Trie {
	char c;
	boolean isEnd;
	Map<Character, Trie> next;

	public Trie(char c) {
		this.c = c;
		next = new HashMap<Character, Trie>();
	}

	public void setEnd() {
		this.isEnd = true;
	}

}

public class WordDictionary {
	public static void main(String[] args) {
		WordDictionary12 wd = new WordDictionary12();
		wd.addWord("abc");
		System.out.println(wd.search("..c"));
	}
}
