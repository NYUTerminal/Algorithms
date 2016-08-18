package leetcode;

public class BitWise {
	
	public static void main(String[] args) {
		BitWise b = new BitWise();
		b.toBinary(10);
	}
	
	public void toBinary(int num){
		StringBuffer sb = new StringBuffer();
		while(num>0){
			sb.append(num & 1);
			num >>= 1;
		}
		System.out.println(sb.reverse().toString());
	}
}
