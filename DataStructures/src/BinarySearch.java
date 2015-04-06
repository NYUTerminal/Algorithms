public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binaySearch(arr, 3, 0, 7));
	}

	private boolean binaySearch(int[] arr, int val, int low, int high) {
		if (arr.length == 0) {
			return false;
		}
		return binarySearchHelper(arr, val, low, high);
	}

	private boolean binarySearchHelper(int[] arr, int val, int low, int high) {
		if (high < low) {
			return false;
		} else {
			int mid = low + ((high - low) / 2);
			if (arr[mid] > val) {
				return binarySearchHelper(arr, val, low, mid - 1);
			} else if (arr[mid] < val) {
				return binarySearchHelper(arr, val, mid + 1, high);
			} else {
				return true;
			}
		}
	}

}
