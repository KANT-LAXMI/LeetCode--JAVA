package LeetCode;

import java.util.Arrays;

public class Question14_LongestCommonPrefix {
	public static String longestCommonPrefix(String[] str) {
		
		Arrays.sort(str);
		String s1=str[0];
		String s2=str[str.length-1];
		int index=0;
		while(index<s1.length() && index<s2.length()) {
			if(s1.charAt(index)==s2.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		return s1.substring(0,index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(str));
	}

}
