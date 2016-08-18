package leetcode;

public class FlipXandO {
	    public void solve(char[][] board) {
	        if(board.length==0){
	            return;
	        }else if(board[0].length == 0){
	            return;
	        }
	        /*
	            1 1 1 1
	            1 0 0 0
	            1 0 0 0 
	            0 0 0 0
	            ["OXXOX",
	             "XOOXO",
	             "XOXOX",
	             "OXOOO",
	             "XXOXO"]
	             
	             
	             ["OXXOX",
	              "XXXXO",
	              "XXXOX",
	              "OXOOO",
	              "XXOXO"]
	        */
	        int[][] cacheDown = new int[board.length][board[0].length];
	        int[][] cacheUp = new int[board.length][board[0].length];
	        for(int i=0;i<board.length;i++){
	            for(int j = 0;j<board[0].length;j++){
	                if(board[i][j] == 'O' && isFlipDown(i,j,board)){
	                    cacheDown[i][j] = 1;
	                }
	            }
	        }
	         for(int i=board.length;i>=0;i--){
	            for(int j = board[0].length-1;j>=0;j--){
	                if(board[i][j] == 'O' && isFlipUp(i,j,board)){
	                    cacheUp[i][j] = 1;
	                }
	            }
	        }
	        for(int i=0;i<board.length;i++){
	            for(int j = 0;j<board[0].length;j++){
	                if(cacheUp[i][j] == 1){
	                    board[i][j] = 'X';
	                }
	            }
	        }
	    }
	    
	    private boolean isFlipDown(int i , int j , char[][] board){
	        int row = board.length-1;
	        int col = 0;
	        if(row>0)
	         col = board[0].length-1;
	        
	        if(i==0 || i==row || j == 0 || j == col){
	            return false;
	        }else if(board[i-1][j]=='X' || board[i][j-1] == 'X' || board[i+1][j] == 'X' || board[i][j+1] == 'X'){
	            return true;
	        }   
	        return false;
	    }
	    
	     private boolean isFlipUp(int i , int j , char[][] board){
	        int row = board.length-1;
	        int col = 0;
	        if(row>0)
	         col = board[0].length-1;
	        
	        if(i==0 || i==row || j == 0 || j == col){
	            return false;
	        }else if(board[i-1][j]=='X' || board[i][j-1] == 'X' || board[i+1][j] == 'X' || board[i][j+1] == 'X'){
	            return true;
	        }   
	        return false;
	    }
}
