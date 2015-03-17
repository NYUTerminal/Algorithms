public class MinHeap {

	int arr[] = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };

	public static void main(String[] args) {
		MinHeap mh = new MinHeap();
		System.out.println(mh.arr.length / 2);
		for (int i = (mh.arr.length / 2) - 1; i >= 0; i--) {
			mh.minHeapify(i);
		}
		// print array to check array
		mh.printArray(mh.arr);
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private void minHeapify(int i) {
		// index of array starts from 0
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int smallest;
		if (l < arr.length && arr[i] > arr[l]) {
			smallest = l;
		} else {
			smallest = i;
		}
		if (r < arr.length && arr[smallest] > arr[r]) {
			smallest = r;
		}
		if (smallest != i) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeapify(smallest);
		}

	}

}
