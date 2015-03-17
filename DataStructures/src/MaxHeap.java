public class MaxHeap {

	int arr[] = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };

	public static void main(String[] args) {
		MaxHeap mh = new MaxHeap();
		System.out.println(mh.arr.length / 2);
		for (int i = (mh.arr.length / 2) - 1; i >= 0; i--) {
			mh.maxHeapify(i);
		}
		// print array to check array
		mh.printArray(mh.arr);
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private void maxHeapify(int i) {
		// index of array starts from 0
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest;
		if (l < arr.length && arr[i] < arr[l]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r < arr.length && arr[largest] < arr[r]) {
			largest = r;
		}
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(largest);
		}

	}

}
