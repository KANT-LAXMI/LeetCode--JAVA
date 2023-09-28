package LeetCode;

import java.util.Arrays;

public class Question128_LongestConsecutiveSequence {
	public static int longestConsecutive(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		Arrays.sort(arr);
		int count = 1;
		int maxCount=1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]== arr[i+1]) {
				continue;
			}
			if(arr[i]+1==arr[i+1]) {
				count++;
//				if(count>maxCount) {
//					maxCount=count;
//				}
				maxCount=Math.max(maxCount, count);
			}else {
				count=1;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9,1,4,7,3,-1,0,5,8,-1,6 };
		System.out.println(longestConsecutive(arr));
	}

}
