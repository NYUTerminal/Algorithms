import java.util.LinkedHashMap;
import java.util.Map.Entry;

class MyObj {
	int index = 0;
	int count = 0;

	public MyObj(int i, int c) {
		this.index = i;
		this.count = c;
	}

}

public class FirstUniqueObject {

	public static void main(String[] args) {
		FirstUniqueObject fub = new FirstUniqueObject();
		fub.getFirstUniqueObj("geeksforgeeksbabyforay");
		fub.getFirstUniqueObjWithOutHashMap("geeksforgeeksbabyforay");
	}

	private void getFirstUniqueObj(String input) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (lhm.get(c) != null) {
				lhm.put(c, lhm.get(c) + 1);
				continue;
			}
			lhm.put(c, 1);
		}
		for (Entry<Character, Integer> e : lhm.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}

	}

	private void getFirstUniqueObjWithOutHashMap(String input) {
		MyObj[] myobjArray = new MyObj[52];
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			int index = c - 'a';
			if (myobjArray[index] != null) {
				myobjArray[index].count++;
				continue;
			}
			myobjArray[index] = new MyObj(i, 1);
		}
		MyObj minObject = null;
		int index = -1;
		for (int i = 0; i < myobjArray.length; i++) {
			if (minObject == null && myobjArray[i] != null
					&& myobjArray[i].count == 1) {
				minObject = myobjArray[i];
				index = i;
			} else if (minObject != null && myobjArray[i] != null
					&& myobjArray[i].count == 1
					&& myobjArray[i].index < minObject.index) {
				minObject = myobjArray[i];
				index = i;
			}
		}
		// Still prints a if there are no common chars.
		if (index != -1)
			System.out.println((char) ('a' + index));

	}

}
