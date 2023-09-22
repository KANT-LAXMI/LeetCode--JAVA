package LeetCode;

public class Question28_FirstOccurenceOfGivenWord {

	public static int occurence(String haystack,String needle) {
		return haystack.indexOf(needle);
	}
	public static void main(String[] args) {
		
		String haystack="sadbutsad";
		String needle="sad";
		System.out.println(occurence(haystack, needle));

	}

}
