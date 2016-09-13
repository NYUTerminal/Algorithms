package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumToWords {

	private String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	private String[] tens = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	private Map<Integer, String> words = new HashMap<Integer, String>();

	NumToWords() {
		words.put(0, "");
		words.put(1, "thousand");
		words.put(2, "million");
		words.put(4, "billion");
	}

	public static void main(String[] args) {
		new NumToWords().getWords(1234567L);
	}

	private String getWords(long num) {

		if (num < 20) {
			System.out.println(ones[(int) num]);
		}
		List<Integer> numList = new ArrayList<Integer>();
		while (num > 0) {
			numList.add((int) (num % 1000));
			num = num / 1000;
		}
		StringBuffer completeString = new StringBuffer();
		for (int i = numList.size() - 1; i >= 0; i--) {
			completeString.append(getHundred(numList.get(i))).append(" ").append(words.get(i)).append(", ");
		}
		System.out.println(completeString.toString());
		return completeString.toString();

	}

	private String getHundred(int num) {
		StringBuffer words = new StringBuffer();
		if (num < 20) {
			return ones[num];
		} else {
			int one = num % 10;
			num = num / 10;
			int ten = num % 10;
			num = num / 10;
			int hundred = num % 10;
			if (hundred != 0) {
				words.append(ones[hundred]).append(" ").append("hundred").append(" ");
			}
			if (ten != 0) {
				words.append(tens[ten]).append(" ");
			}
			if (one != 0) {
				words.append(ones[one]).append(" ");
			}
			return words.toString();
		}
	}

}
