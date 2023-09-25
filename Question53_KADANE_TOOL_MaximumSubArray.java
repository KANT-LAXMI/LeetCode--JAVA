package LeetCode;

public class Question53_KADANE_TOOL_MaximumSubArray {
	public static int maxSubArray(int[] arr) {
		int sum = arr[0], maxSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (sum >= 0) {
				sum += arr[i];
			} else {
				sum = arr[i];
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));

	}

}
