public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3, 6, 7, 2, 10, 77 };
		bubbleSort(arr);
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

	private static void bubbleSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
