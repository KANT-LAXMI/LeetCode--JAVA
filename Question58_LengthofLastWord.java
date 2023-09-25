package LeetCode;

public class Question58_LengthofLastWord {
	public static int lengthOfLastWord(String s) {
		String[] sp = s.split(" ");
		String str = sp[sp.length-1];
		return str.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="old is gold";
		System.out.println(lengthOfLastWord(s));
		
	}

}
