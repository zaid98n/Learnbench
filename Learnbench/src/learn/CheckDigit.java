package learn;

public class CheckDigit {
	
	public static boolean isDigit(String str) {
		
		for(int i=0; i<=str.length()-1; i++) {
			if(!Character.isDigit( str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String value = "123q";
		
		if(isDigit(value)==true) {
			System.out.println("String is only Digit");
		}
		else {
			System.out.println("String is not only digit");
		}
	}

}
