import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Range implements Comparable<Range> {
	int start;
	int end;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Range o) {
		// TODO Auto-generated method stub
		return this.start - o.start;
	}

}

public class ComparatorImpl {
	public static void main(String[] args) {

		List<Range> rangeList = new ArrayList<Range>();
		rangeList.add(new Range(1, 4));
		rangeList.add(new Range(12, 2));
		rangeList.add(new Range(5, 7));
		rangeList.add(new Range(8, 9));
		rangeList.add(new Range(10, 12));
		rangeList.add(new Range(1, 7));
		rangeList.remove(2);
		Collections.sort(rangeList);
		for (Range r : rangeList) {
			System.out.println(r.start + " " + r.end);
		}

	}

}
