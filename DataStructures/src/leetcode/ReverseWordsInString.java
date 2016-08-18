package leetcode;

public class ReverseWordsInString {

	public static void main(String[] args) {
		ReverseWordsInString rs = new ReverseWordsInString();
	}

	public String reverseWords(String s) {
        if(s == null || s.equals("")){
            return s;
        }
        String[] split = s.split("\\s+");
        split = reverse(split);
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<split.length;i++){
            sb.append(split[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    private String[] reverse(String[] s){
        for(int i = 0;i<s.length/2;i++){
            String temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        return  s;
    }

}
