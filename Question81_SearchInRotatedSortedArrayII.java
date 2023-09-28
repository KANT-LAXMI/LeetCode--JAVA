package LeetCode;

public class Question81_SearchInRotatedSortedArrayII {
	public static boolean search(int[] arr, int target) {
		int l = 0;
		int h = arr.length - 1;
		int mid = 0;
		while (l <= h) {
			mid = (l + h) / 2;
			if (arr[mid] == target) {
				return true;
			} else if (arr[l] <= arr[mid]) {
				if (arr[l] <= target && target < arr[mid]) {
					h = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {
				if (arr[h] >= target && target > arr[mid]) {
					l = mid + 1;
				} else {
					h = mid - 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 6, 0, 0, 1, 2 };
		System.out.println(search(arr, 1));
	}

}
