package leetcode;

public class SpiralMatrixII59 {
	
	public static void main(String[] args) {
		SpiralMatrixII59 sp = new SpiralMatrixII59();
		sp.generateMatrix(3);
	}
	    public int[][] generateMatrix(int n) {
	        int[][] spiral = new int[n][n];
	        int num = 1;
	        for(int i =0;i<n/2;i++){
	                //Fill Top
	                
	                for(int j =i;j<n-i-1;j++){
	                   spiral[i][j] = num;
	                   num++;
	                }
	                //Fill right
	                for(int j =i;j<n-i-1;j++){
	                   spiral[j][n-i-1] = num;
	                   num++;
	                }
	                
	                //Fill bottom
	                for(int j =n-i-1;j>i;j--){
	                   spiral[n-i-1][j] = num;
	                   num++;
	                }
	                //Fill left.
	                 for(int j =n-i-1;j>i;j--){
	                   spiral[j][i] = num;
	                   num++;
	                }
	        }
	        if(n%2>0){
	            spiral[n/2][n/2] = num;
	        }
	        return spiral;
	    }
}
