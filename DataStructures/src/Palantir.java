import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;

public class Palantir {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();	

		int[][] a = new int[n][n]; 

		Map<Cordinate, Node> amap = new HashMap<Cordinate, Node>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
				amap.put(new Cordinate(i, j), new Node(i, j, a[i][j]));
			}
		}

		for (Cordinate c : amap.keySet()) {
			Node cur = amap.get(c);
			cur.attachParent(determineParent(a, amap, c, n));
		}

		List<Node> sinks = new ArrayList<Node>();
		for (Cordinate c : amap.keySet()) {
			Node cur = amap.get(c);
			if (cur.parent == null)
				sinks.add(cur);
		}
		Collections.sort(sinks, new MyIntComparable());
		for (int i = 0; i < sinks.size(); i++) {
			System.out.print(deterMineSize(sinks.get(i)));
			System.out.print(" ");
		}

	}

	static int deterMineSize(Node n) {
		if (n == null)
			return 0;
		int size = 1;
		for (Node cur : n.children) {
			size = size + deterMineSize(cur);
		}
		return size;
	}

	static Node determineParent(int a[][], Map<Cordinate, Node> map,
			Cordinate c, int n) {

		Cordinate c1 = new Cordinate(c.x + 1, c.y);
		Cordinate c2 = new Cordinate(c.x - 1, c.y);
		Cordinate c3 = new Cordinate(c.x, c.y + 1);
		Cordinate c4 = new Cordinate(c.x, c.y - 1);
		Node parent = null;

		int value = a[c.x][c.y];

		if (checkRange(c1, n) && a[c1.x][c1.y] < value) {
			value = a[c1.x][c1.y];
			parent = map.get(c1);
		}
		if (checkRange(c2, n) && a[c2.x][c2.y] < value) {
			value = a[c2.x][c2.y];
			parent = map.get(c2);
		}

		if (checkRange(c3, n) && a[c3.x][c3.y] < value) {
			value = a[c3.x][c3.y];
			parent = map.get(c3);
		}

		if (checkRange(c4, n) && a[c4.x][c4.y] < value) {
			value = a[c4.x][c4.y];
			parent = map.get(c4);
		}

		return parent;

	}

	static boolean checkRange(Cordinate c, int n) {
		if (c.x >= 0 && c.x < n)
			if (c.y >= 0 && c.y < n)
				return true;
		return false;

	}

}

class Node {
	int i;
	int j;
	int altitude;
	Node parent;
	List<Node> children;

	Node(int i, int j, int altitude) {
		this.i = i;
		this.j = j;
		this.altitude = altitude;
		parent = null;
		children = new ArrayList<Node>();
	}

	void attachParent(Node p) {
		this.parent = p;
		if (p != null)
			p.children.add(this);
	}

}

class Cordinate {
	int x;
	int y;

	Cordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Cordinate))
			return false;
		else
			return this.x == ((Cordinate) o).x && this.y == ((Cordinate) o).y;
	}
}

class MyIntComparable implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		return (o1.altitude > o2.altitude ? -1
				: (o1.altitude == o2.altitude ? 0 : 1));
	}
}