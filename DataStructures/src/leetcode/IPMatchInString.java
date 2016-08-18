package leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPMatchInString {
	public static void main(String[] args) {
			new IPMatchInString().getIps("hey check this 22.234.22.1");
	}
	
	private List<String> getIps(String s )
	{
	  List<String> list = new ArrayList<String>();
	  Pattern p = Pattern.compile("\\d+.\\d+.\\d+.\\d+");
	  Matcher m = p.matcher(s);
//	  Pattern pattern = Pattern.compile(patternString);
//      Matcher matcher = pattern.matcher(text);

      int count = 0;
      while(m.find()) {
    	  String s1 = s.substring(m.start(),m.end());
    	  String[] arr = s1.split("/.");
    	  System.out.println(s1);
          count++;
          System.out.println("found: " + count + " : "
                  + m.start() + " - " + m.end());
      }
	  return list;
	}
	
	private boolean isValidIp(String s)
	{
	    Boolean ret = true; 
	    for(String s1 : s.split("."))
	         ret = ret && (Integer.valueOf(s1) >=0 && Integer.valueOf(s1)<=255);
	           
	  
	  return ret;
	}
}
