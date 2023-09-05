package learn;

public class SumOfDigits {
	
	public static int sum(int num) {
		
		String str = Integer.toString(num);
		int sum_of_digits = 0;
		
		if(str.length()!=1) {
			for(int i=0; i<=str.length()-1; i++) {
				sum_of_digits = sum_of_digits + Character.getNumericValue(str.charAt(i));
			}
			return sum_of_digits;
		}
		else {
			return num;
		}
				
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1234));
	}

}
