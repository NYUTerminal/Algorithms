package leetcode;

public class ArrPerm {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		permutations(arr, 0);
	}

	private static void permutations(int[] lines, int pos) {
		if (pos == lines.length) {
			// call to get V val;
			for(int i : lines){
				System.out.print(i+",");
			}
			System.out.println("\n");
			return;
		}
		// 1,2,3,4 =>
		for (int i = pos; i < lines.length; i++) {
			int var = lines[i];
			lines[i] = lines[pos];
			lines[pos] = var;
			permutations(lines, pos + 1);
			int var1 = lines[i];
			lines[i] = lines[pos];
			lines[pos] = var1;
		}

	}
}
