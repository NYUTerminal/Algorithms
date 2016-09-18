package misc;

public class StringPermutations {

	public static void main(String[] args) {
		String inputStr = "abc";
		new StringPermutations().permutations(inputStr.toCharArray(), 0);
	}

	private void permutations(char[] input, int start) {
		if (input.length == start) {
			System.out.println(new String(input));
			return;
		}
		for (int i = start; i < input.length; i++) {
			char temp = input[i];
			input[i] = input[start];
			input[start] = temp;
			permutations(input, start + 1);
			temp = input[start];
			input[start] = input[i];
			input[i] = temp;
		}
	}

}
