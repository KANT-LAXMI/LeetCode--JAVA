package LeetCode;

public class Question33_SearchInRotatedSortedArray {
	public static int search(int[] arr, int target) {
		int l = 0;
		int h = arr.length - 1;
		int mid = 0;
		while (l <= h) {
			mid = (l + h) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[l] <= arr[mid]) {
				if (target >= arr[l] && target < arr[mid]) {
					h = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {
				if (target <= arr[h] && target > arr[mid]) {
					l = mid + 1;
				} else {
					h = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 8, 1, 2 };
		System.out.println(search(arr, 5));
	}

}
