import java.util.HashMap;
import java.util.Map.Entry;

class MyString {
	String str;

	@Override
	public int hashCode() {
		return this.str.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		MyString other = (MyString) o;
		if (other.str.equals(this.str)) {
			return true;
		}
		return false;
	}

}

public class test {

	public static void main(String[] args) {
		HashMap<String, Integer> sb = new HashMap<String, Integer>();
		String s = "ab";
		sb.put(s, 1);
		sb.put(s, 2);
		HashMap<MyString, Integer> sb1 = new HashMap<MyString, Integer>();
		MyString ss = new MyString();
		ss.str = "prav";
		sb1.put(ss, 1);
		sb1.put(ss, 2);
		for (Entry<MyString, Integer> e : sb1.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
