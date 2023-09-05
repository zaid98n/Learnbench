package learn;

public class MaxConsecutiveElements {
	
	public static int countMaxConsecutiveElements(int[] arr) {
		
		int count = 0;
		int max = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==1) count++;
			else count=0;
			
			if(count>max) max=count;
			
		}
//		if(count>max) {
//			max=count;
//		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1};
		System.out.println(countMaxConsecutiveElements(arr));
	}

}
