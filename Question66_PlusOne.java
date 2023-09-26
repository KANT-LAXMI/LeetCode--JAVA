package LeetCode;

import java.util.Arrays;

public class Question66_PlusOne {
	public static int[] plusOne(int[] nums) {

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] < 9) {
				nums[i] = nums[i] + 1;
				return nums;
			} else {
				nums[i] = 0;
			}
		}

		//nums = new int[nums.length + 1]; 
		//assigns the reference of this new array to the variable nums, effectively replacing the original array with the new one.
		nums = new int[nums.length + 1];
		nums[0] = 1;
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(plusOne(nums)));
	}

}
