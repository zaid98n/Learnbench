package learn;

public class EvenSum {
	
	public static int sumOfEven(int start, int end) {
		
		int sum = 0;
		
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfEven(1, 100));
	}

}
