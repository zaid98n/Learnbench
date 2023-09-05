package learn;

public class ArraySum {
	
	public static int arrSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			sum=sum+arr[i];
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] x = {2, 3, 5, 7, 11};
		
		System.out.println(arrSum(x));
	}

}
