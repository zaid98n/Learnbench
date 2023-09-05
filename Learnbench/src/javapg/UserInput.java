package javapg;

import java.util.Scanner;

public class UserInput {
	
	Scanner s = new Scanner(System.in);
	
	public void add() {
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter first number");
		int y = s.nextInt();
		System.out.println("Addition = "+(x+y));
	}
	
	public void sub() {
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter first number");
		int y = s.nextInt();
		System.out.println("Subtraction = "+(x-y));
	}
	
	public void mul() {
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter first number");
		int y = s.nextInt();
		System.out.println("Multiplication = "+(x*y));
	}
	
	public void div() {
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter first number");
		int y = s.nextInt();
		System.out.println("Division = "+(x/y));
	}
	
	public void calculation() {
		System.out.println("Enter operator: +, -, *, /");
		String ss = s.nextLine();
		if (ss.equals("+")) {
			add();
		}
		else if (ss.equals("-")) {
			sub();
		}
		else if (ss.equals("*")) {
			mul();
		}
		else if (ss.equals("/")) {
			div();
		}
		else {
			System.out.println("Invalid Operator...");
		}
	}
	
	public static void main(String[] args) {
		UserInput obj = new UserInput();
		obj.calculation();
	}

}
