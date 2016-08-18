package leetcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator<E> implements Iterator<E> {

	private E next = null;
	private Iterator<E> integerIterator;

	public PeekingIterator(Iterator<E> iterator) {
		// initialize any member here.
		integerIterator = iterator;
		if (integerIterator.hasNext()) {
			next = integerIterator.next();
		}
	}

	// Returns the next element in the iteration without advancing the iterator.
	public E peek() {
		return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public E next() {
		E temp = next;
		if (integerIterator.hasNext()) {
			next = integerIterator.next();
		} else {
			next = null;
		}
		return temp;
	}

	@Override
	public boolean hasNext() {
		if (next != null) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		Iterator<Integer> iterator = intList.iterator();
		PeekingIterator pi = new PeekingIterator(iterator);
		System.out.println(pi.next());

	}
}
