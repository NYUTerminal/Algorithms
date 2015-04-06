import java.util.HashMap;

public class Panagrams {

	public static void main(String[] args) {
		//System.out
			//	.println(isPanagram("We promptly judged antique ivory buckles for the next prize"));
	}

	private static boolean isPanagram(String s) {
		if (s == null) {
			return false;
		}
		s = s.toLowerCase();
		s = s.replaceAll("\\s+", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), i);
			}
		}
		char start = 'a';
		System.out.println((int) start);

		for (char c = start; c <= 'z'; c++) {
			if (map.get(c) == null) {
				return false;
			}
		}
		return true;
	}

}
