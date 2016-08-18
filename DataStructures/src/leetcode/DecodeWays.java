package leetcode;
import java.util.HashMap;

public class DecodeWays {
	public static void main(String[] args) {
		System.out.println(new DecodeWays().numDecodings("27"));
	}
	public int numDecodings(String s) {
		if (s == null || s.equals("") || s.equals("0")) {
			return 0;
		}
		return numDecodeUtil(s, new HashMap<String, Integer>());
	}

	private int numDecodeUtil(String s, HashMap<String, Integer> cache) {
		if (s.length() <= 2) {
			if (Integer.valueOf(s) >= 1 && Integer.valueOf(s) <= 9) {
				return 1;
			}
			if (Integer.valueOf(s) >= 10 && Integer.valueOf(s) <= 26) {
				return 2;
			}
		}
		if (cache.get(s) != null) {
			return cache.get(s);
		}

		int ways = 0;
		for (int i = 0; i < s.length()-1; i++) {
			ways += numDecodeUtil(s.substring(0, i + 1), cache) * numDecodeUtil(s.substring(i+1, s.length()), cache);
		}
		if (cache.get(s) == null) {
			cache.put(s, ways);
		}
		return ways;
	}
}
