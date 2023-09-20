package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Question12_IntegerToRoman {

	public static String intToRoman(int num) {
		
		Map<Integer, String> m=new HashMap<>();
		   m.put(1000, "M");
		    m.put(900, "CM");
		    m.put(500, "D");
		    m.put(400, "CD");
		    m.put(100, "C");
		    m.put(90, "XC");
		    m.put(50, "L");
		    m.put(40, "XL");
		    m.put(10, "X");
		    m.put(9, "IX");
		    m.put(5, "V");
		    m.put(4, "IV");
		    m.put(1, "I");
		    StringBuilder result = new StringBuilder();

		    Integer[] key = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		    for (int i = 0; i < key.length; i++) {
		        int value = key[i];
		        String symbol = m.get(value);
		        while (num >= value) {
		            result.append(symbol);
		            num -= value;
		        }
		    }

		    return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 55;
		    String romanNumeral = intToRoman(num);
		   System.out.println(romanNumeral);

	}

}
