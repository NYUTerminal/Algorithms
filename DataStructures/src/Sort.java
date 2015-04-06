import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}

	/*
	 * @Override public int compare(Person o1, Person o2) { return
	 * Integer.compare(o1.id, o2.id); }
	 */
}

public class Sort {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(123, "sun"));
		list.add(new Person(124, "sun1"));
		list.add(new Person(125, "sun2"));
		list.add(new Person(126, "sun3"));
		Collections.sort(list, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.id, p2.id);
			}
		});
		Collections.sort(list);
		for (Person p : list) {
			System.out.println(p.id);
		}
	}

}
