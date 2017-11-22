package CrackingTheCodingInterview.DS.BalancedBrackets;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static boolean isBalanced(String expression) {

		if((expression.length() & 1) == 1){
			return false;
		}
		Stack<Character> s = new Stack<>();

		for(int i = 0; i < expression.length(); i++){
			if(expression.charAt(i) == '{'){
				s.push('}');
			}
			else if(expression.charAt(i) == '['){
				s.push(']');
			}
			else if(expression.charAt(i) == '('){
				s.push(')');
			}
			else{
				if(s.isEmpty() || s.pop() != expression.charAt(i)){
					return false;
				}
			}
		}
		return s.isEmpty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}
}
