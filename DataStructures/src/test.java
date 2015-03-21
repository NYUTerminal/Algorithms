public class test {

	public static void main(String[] args) {
		int x = 112345;
		int[] storeDigits = new int[10];
		int count = 0;
		while (x > 0) {
			storeDigits[count] = x % 10;
			x = x / 10;
			count++;
			//System.out.println(x % 10);
			//System.out.println(x / 10);
		}
		for (int i = 0; i < storeDigits.length; i++) {
			System.out.println(storeDigits[i]);
		}
		while(count>0){
			if(count==6){
				
			}
				
		}
	}
	
	private void checkTwoDimensionalString(){
		char[][] twoDimStrings = {};
 		
		
		
	}

}


class Student{  
    int rollno;  
    String name;    
}  
