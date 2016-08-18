import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MobilePad {
	public static HashMap<Integer, Character[]> keyPad = new HashMap<Integer, Character[]>();

	public static void main(String[] args) {
		Character[] arr;
		arr = new Character[] {};
		keyPad.put(1, arr);
		arr = new Character[] { 'a', 'b', 'c' };
		keyPad.put(2, arr);
		arr = new Character[] { 'd', 'e', 'f' };
		keyPad.put(3, arr);
		arr = new Character[] { 'g', 'h', 'i' };
		keyPad.put(4, arr);
		arr = new Character[] { 'j', 'k', 'l' };
		keyPad.put(5, arr);
		arr = new Character[] { 'm', 'n', 'o' };
		keyPad.put(6, arr);
		arr = new Character[] { 'p', 'q', 'r', 's' };
		keyPad.put(7, arr);
		arr = new Character[] { 't', 'u', 'v' };
		keyPad.put(8, arr);
		arr = new Character[] { 'w', 'x', 'y', 'z' };
		keyPad.put(9, arr);
		keyPad.put(0, arr);
		MobilePad mp = new MobilePad();
		int[] dig = { 2, 3, 4 };
		mp.getPossibleWords(dig);

	}

	private ArrayList<String> getPossibleWords(int[] digit) {
		int n = digit.length;
		char[] output = new char[n];
		List<String> wordList = new ArrayList<String>();
		getWordsRecursively(output, digit, 0, digit.length, wordList);
		return null;
	}

	private void getWordsRecursively(char[] output, int[] digit, int currInd,
			int n, List<String> wordList) {
		if (currInd == output.length) {
			System.out.println(String.valueOf(output));
			wordList.add(output.toString());
			return;
		}
		double sqrt = Math.sqrt((double) 64);
		System.out.println(sqrt);
		for (int j = 0; j < keyPad.get(digit[currInd]).length; j++) {
			output[currInd] = keyPad.get(digit[currInd])[j];
			getWordsRecursively(output, digit, currInd + 1, n, wordList);
		}
	}
}
