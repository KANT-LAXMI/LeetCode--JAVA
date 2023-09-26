package LeetCode;

public class Question67_AddBinary {
	public static String addBinary(String a, String b) {
		Integer A = Integer.valueOf(a, 2);
		Integer B = Integer.valueOf(b, 2);
		int c=A+B;
		return Integer.toBinaryString(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer.valueOf(binaryString, 2);
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}

}
