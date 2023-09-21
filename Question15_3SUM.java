package LeetCode;

public class Question15_3SUM {
	public static void threeSum(int[] a) {
		int x = a.length;
		for (int i = 0; i < x - 2; i++) {
			for (int j = i + 1; j < x - 1; j++) {
				for (int k = j + 1; k < x; k++) {
					int sum = a[i] + a[j] + a[k];
					if (sum == 0) {
						System.out.println(a[i] + " " + a[k] + " " + a[j]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1, 0, 1, 2, -1, -4 };
		int count = 3;
		if (!(a.length < count)) {
			threeSum(a);
		}

	}

}
