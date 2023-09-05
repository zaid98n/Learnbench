package learn;

public class EvenOdd {
	
	public static String oddEven(int num) {
		String even = "is an even number";
		String odd = "is an odd number";
		
		if(num%2==0) {
			return num+ " " +even;
		}
		return num+ " " +odd;
	}
	
	public static void main(String[] args) {
		System.out.println(oddEven(5));
	}

}
