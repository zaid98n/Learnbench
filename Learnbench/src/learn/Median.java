package learn;

import java.util.Arrays;

public class Median {
	
	public static int medianValue(int[] arr) {
		
		Arrays.sort(arr);
		int median;
		
		if((arr.length)%2==0) {
			median = (arr[(arr.length-1) / 2] + arr[(arr.length) / 2]) / 2;
			return median;
		}
		else {
			median = arr[(arr.length-1) / 2];
			return median;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 2, 3, 9};

		int[] arr2 = {1, 11, 5, 15};
		
		System.out.println(medianValue(arr1));
		System.out.println(medianValue(arr2));
	}

}
