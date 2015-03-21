import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sol {

	public static void main(String args[]) throws ParseException {

		String[] inputFruits = { "apple", "pear", "orange", "pear", "grape",
				"strawberry", "pear", "grape", "orange" };
		Map<String, Integer> fruits = new HashMap<String, Integer>();

		for (String fruit : inputFruits) {
			if (fruits.containsKey(fruit))
				fruits.put(fruit, fruits.get(fruit) + 1);
			else
				fruits.put(fruit, 1);
		}

		List<Map.Entry<String, Integer>> entries = new ArrayList<>(
				fruits.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> a,
					Map.Entry<String, Integer> b) {
				return a.getValue().equals(b.getValue()) ? a.getKey()
						.compareTo(b.getKey()) : Integer.compare(b.getValue(),
						a.getValue());
			}
		});
		for (Map.Entry<String, Integer> entry : entries)
			System.out.println(entry.getKey() + " - " + entry.getValue());
	}

}