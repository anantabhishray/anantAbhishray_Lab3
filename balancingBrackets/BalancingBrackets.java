package balancingBrackets;

import java.util.*;

public class BalancingBrackets {
	
	static boolean checkingBracketsBalanced(String strBalenceBrackets) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i<strBalenceBrackets.length(); i++) {
			
			char character = strBalenceBrackets.charAt(i);
			if (character == '{' || character == '[' || character == '(') {
				stack.push(character);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
				
			}
			
			char c;
			
			switch(character) {
			
			case'}' :
				c = stack.pop();
				if(c == '[' || c== '(') 
					return false;
				break;
			case')' :
				c = stack.pop();
				if(c == '{' || c == '[')
					return false;
				break;
			case']' :
				c = stack.pop();
				if(c =='{' || c == '(')
					return false;
				break;
					
			}
		
		}
		
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		
		System.out.println("Please enter the String you wish to check for Balanced Brackets- ");
		
		try (Scanner sc = new Scanner(System.in)) {
			String strBracketExpression = sc.next();
						
			Boolean result ;
			
			result = checkingBracketsBalanced(strBracketExpression);
			
			if(result) {
				System.out.println("The entered String has Balanced Brackets.");
			}
			
			else {
				System.out.println("The entered String does not contain Balanced Brackets.");
			}
		
		}
	
	}

}
