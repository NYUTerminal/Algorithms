package leetcode;

public class SingleNumber136 {
	
	public static void main(String[] args) {
		SingleNumber136 sn = new SingleNumber136();
		int[] input = {2,3,4,3,2,4,5};
		System.out.println(sn.singleNumber(input));
	}
	
	private int singleNumber(int[] input){
		if(input.length == 1){
			return input[0];
		}
		int temp = input[0];
		for(int i =1;i<input.length;i++){
			temp = temp^ input[i];
		}
		return temp;
	}

}
