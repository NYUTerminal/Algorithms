package leetcode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DistanceBetweenWords {
	public static void main(String[] args) {
		Set<String> sample = new HashSet<String>();
		sample.add("hot");
		sample.add("dog");
		sample.add("dot");
		new DistanceBetweenWords().ladderLength( "hot", "dog",sample);
		HashMap<String,String> map = new HashMap<String,String>();
		for(String s : map.values())
	}
	
	 public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
         Queue<String> queue = new LinkedList<String>();
         queue.add(beginWord);
         wordList.remove(beginWord);
         int distance = 1;
         while(!queue.isEmpty()){
             Queue<String> children = new LinkedList<String>();
             while(!queue.isEmpty()){
                String word = queue.poll();
                for(int i = 0;i<word.length();i++){
                	char[] wordArr = word.toCharArray(); 
                    for(char c='a';c<='z';c++){
                        wordArr[i] = c;
                        String newWord = new String(wordArr);
                        if(newWord.equals(endWord)){
                            return distance+1; 
                        }
                        if(wordList.contains(newWord)){
                            wordList.remove(newWord);
                            children.add(newWord);
                        }
                    }
                }
             }
             distance++;
             queue = children;
         }
         return 0;
    }
}
