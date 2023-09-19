package LeetCode;

import java.util.Arrays;

public class Question1_TwoSum {
	public static int[] twoSum(int[] arr, int target) {
		int res[]=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					res[0]=i;
					res[1]=j;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,4};
		int target=7;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

}
