package leetcode;
import java.util.ArrayList;
import java.util.List;

public class WordSearch {
	
	public static void main(String[] args) {
		int lower =1;
		int higher =10;
		int randValue = lower + (int) (Math.random()*(higher-lower+1));
		System.out.println(randValue);
		List<List<Integer>> test = new ArrayList<List<Integer>>();
		List<String>[] listArr = new ArrayList[10];
		List<String> stringList = new ArrayList<String>();
		stringList.add("test");
		listArr[0] = stringList;
		WordSearch ws = new WordSearch();
		char[][] board = {
							{'A','B','C','E'},
							{'S','F','E','S'},
							{'A','D','E','E'}
						};
		//ws.exist(board, "ABCESEEEFS");
	}
	    public boolean exist(char[][] board, String word) {
	        if(board.length==0 || word.length()==0){
	            return false;
	        }
	        
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[0].length;j++){
	                if(board[i][j] == word.charAt(0)){
	                    int[][] visited = new int[board.length][board[0].length];
	                    if(existsHelper(board, word,visited,0,i,j)){
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	    }

	    private boolean existsHelper(char[][] board, String word,int[][] visited,int index,int iInd,int jInd){
	        // if(insideBoundaries(iInd,jInd,board.length,board[0].length)){
	        // System.out.println(iInd);
	        // System.out.println(jInd);
	        if(board[iInd][jInd]==word.charAt(index)){
	            visited[iInd][jInd] = 1;
	            if(index == word.length()-1){
	                return true;
	            }
	            index++;
	        }else{
	            return false;
	        }
	        
	        int[][] comb = {{iInd+1,jInd},{iInd-1,jInd},{iInd,jInd+1},{iInd,jInd-1}};
	        for(int k=0;k<comb.length;k++){
	            int i = comb[k][0];
	            int j = comb[k][1];
	            if(insideBoundaries(i,j,board.length,board[0].length) && visited[i][j] !=1){
	                    if(existsHelper(board, word,visited,index,i,j)){
	                        return true;
	                    }
	                    visited[i][j] =0;
	            }
	        }
	        return false;
	    }
	    
	    private boolean insideBoundaries(int i,int j,int m,int n){
	         if(i>=0 && j>=0 && i<m && j<n){
	             return true;
	         }else{
	             return false;
	         }
	    }

}
