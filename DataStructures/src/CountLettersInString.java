import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountLettersInString {

	public static void main(String[] args) {
		getCount();

		ArrayList<List<Integer>> adj;
		adj = new ArrayList<List<Integer>>();

	}

	private static void getCount() {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 1);
		map.put('a', map.get('a') + 1);
		map.put('a', map.get('b') + 1);
		// map.put('a', 1);
		// map.put('a', 1);
		for (Map.Entry<Character, Integer> s : map.entrySet()) {
			System.out.println(s.getValue());
		}

	}

	int maxSubArraySum(int a[], int size) {
		int max_so_far = a[0], i;
		int curr_max = a[0];

		for (i = 1; i < size; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}
}
