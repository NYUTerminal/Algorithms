import java.util.Scanner;

public class AlternateChars {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		//myScan.nex;
        String inputString = myScan.nextLine();
		System.out.println(noOfDeletions("BBBBB"));
	}

	private static int noOfDeletions(String input) {
		if (input == null) {
			return -1;
		}
		input = input.replace("\\s+", "");
		if (input == "") {
			return -1;
		}
		char currentChar;
		char nextChar;
		int numberOfDeletion = 0;
		// AABABBA
		for (int i = 0; i < input.length() - 1; i++) {
			currentChar = input.charAt(i);
			nextChar = getNextChar(currentChar);
			if (i + 1 < input.length() && input.charAt(i + 1) != nextChar) {
				numberOfDeletion++;
			}
		}
		return numberOfDeletion;
	}

	private static char getNextChar(char currentChar) {
		char nextChar;
		if (currentChar == 'A') {
			nextChar = 'B';
		} else {
			nextChar = 'A';
		}
		return nextChar;
	}
}
