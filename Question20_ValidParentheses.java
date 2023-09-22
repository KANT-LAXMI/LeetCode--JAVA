package LeetCode;

import java.util.Stack;

public class Question20_ValidParentheses {
	public  static boolean isValid(String s) {
		char[] ch = s.toCharArray();
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(') {
				stack.push(')');
			}else if(ch[i]=='{') {
				stack.push('}');
			}else if(ch[i]=='[') {
				stack.push(']');
			}else if(stack.isEmpty() || stack.pop()!=ch[i]){
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String str = "[{()}]";
		System.out.println(isValid(str));
	}

}
