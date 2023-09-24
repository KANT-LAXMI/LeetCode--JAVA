package LeetCode;

public class Question29_DivideTwoIntegers {
	public static int divide(double dividend, double divisor) {

		int result = 0;
		result = (int) (dividend / divisor);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 7;
		int divisor = 2;
		System.out.println(divide(dividend, divisor));
	}

}
