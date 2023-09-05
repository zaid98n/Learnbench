package learn;

public class Palindrome {
	
	public static boolean isPlaindrome(String str) {
		
		StringBuilder newStr = new StringBuilder(str);
		newStr.reverse();
		
		if(str.equalsIgnoreCase(newStr.toString())) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String checkPalindrome = "oyo";
		
		if (isPlaindrome(checkPalindrome)==true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
