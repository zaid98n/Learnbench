package learn;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {

    public static boolean checkBrackets(String exp) {
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
        	
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println("stack push: " + stack);
                
            } else if (ch == ')' || ch == '}' || ch == ']') {
            	
                if (stack.isEmpty()) {
                    return false;
                }
                System.out.println("stack before pop: " + stack);
                char top = stack.pop();
                System.out.println("stack after pop: " + stack);
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
    	try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the brackets: ");
			String expression = s.nextLine();
			boolean isCorrect = checkBrackets(expression);
			if (isCorrect) {
			    System.out.println("Brackets are correct.");
			} else {
			    System.out.println("Brackets are incorrect.");
			}
		}
    }
}
