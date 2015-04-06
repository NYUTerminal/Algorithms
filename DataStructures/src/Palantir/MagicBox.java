import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		String noOfLines = sc.nextLine();
		String[] rowAndCol = noOfLines.split(" ");
		// HashMap to store key = row , value = count of row and complement
		// string formed by row.
		HashMap<String, Integer> rowFrequencyMapper = new HashMap<String, Integer>();
		for (int i = 0; i < Integer.valueOf(rowAndCol[0]); i++) {
			String row = sc.nextLine();
			// To remove any extra spaces in the row.
			row = row.replace("\\s+", "");
			updateRowFrequency(row, rowFrequencyMapper);
		}
		int maxWishes = 0;
		// To get the max of wishes count from HashMap.
		for (Entry<String, Integer> entry : rowFrequencyMapper.entrySet()) {
			maxWishes = (maxWishes > entry.getValue()) ? maxWishes : entry
					.getValue();
		}
		System.out.println(maxWishes);
	}

	/*
	 * To keep track of number of times a row or its complement string present
	 * in input.
	 */
	private static void updateRowFrequency(String row,
			Map<String, Integer> rowFrequenyMapper) {

		if (rowFrequenyMapper.containsKey(row)) {
			rowFrequenyMapper.put(row, rowFrequenyMapper.get(row) + 1);
			return;
		}
		String flipString = getComplementString(row);
		if (rowFrequenyMapper.containsKey(flipString)) {
			rowFrequenyMapper.put(flipString,
					rowFrequenyMapper.get(flipString) + 1);
			return;
		}
		// If no record found in the map then insert a new record.
		rowFrequenyMapper.put(row, 1);
	}

	/*
	 * Replaces 'T' with 'P' and 'P' with 'T' in the input string.Ex :PTT -> TPP
	 */
	private static String getComplementString(String input) {
		if (input == null || input == "") {
			return input;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i) == 'P' ? "T" : "P");
		}
		return sb.toString();
	}
}