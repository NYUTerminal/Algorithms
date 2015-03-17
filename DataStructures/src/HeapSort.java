public class HeapSort {

	int arr[] = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };

	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		hs.heapSort(hs.arr);
		hs.printArray(hs.arr);
	}

	private void heapSort(int[] arr) {
		int varLength = arr.length - 1;
		int heapSize = arr.length - 1;
		// tricky part not only the first element should be maxheapify .. all
		// the elements has to be max heapify first
		buildMaxHeap(arr);
		for (int i = varLength; i >= 2; i--) {
			swapFirstAndLast(arr, i);
			heapSize = heapSize - 1;
			maxHeapify(0, heapSize);
		}
	}

	private void buildMaxHeap(int[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			maxHeapify(i, arr.length - 1);
		}
		// print array to check array
		// mh.printArray(mh.arr);
	}

	private void swapFirstAndLast(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[0];
		arr[0] = temp;
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private void maxHeapify(int i, int heapSize) {
		// index of array starts from 0
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest;
		if (l < heapSize && arr[i] < arr[l]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r < heapSize && arr[largest] < arr[r]) {
			largest = r;
		}
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(largest, heapSize);
		}

	}

}
