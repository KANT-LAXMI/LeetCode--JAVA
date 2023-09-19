package LeetCode;

public class Question7_ReverseInteger {
	public static int reverse(int x) {
		//Given a signed 32-bit integer x, return x with its digits reversed.
		//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0
		int sum = 0;
		int r = 0;
		int prevSum = 0;
		while (x > 0 || x < 0) {
			r = x % 10;
			sum = (sum * 10) + r;
			//checking for overflow by reversing the transformation
			if ((sum - r) / 10 != prevSum) {
				return 0;
			}
			prevSum = sum;
			x = x / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		//maximum value of 32 bit integer is 2147483647 and minimum is -2147483648
		//int x = 2147483647;
		int x=-12345;
		System.out.println(reverse(x));
	}

}
