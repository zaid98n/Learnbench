package learn;

public class NumberPalindrome {
	
	public static boolean isNumPalindrome(int num) {
		
		String str = Integer.toString(num);
		
		StringBuilder newStr = new StringBuilder(str);
		newStr.reverse();
		
		if(str.equalsIgnoreCase(newStr.toString())) {
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		System.out.println(isNumPalindrome(101));
	}

}
