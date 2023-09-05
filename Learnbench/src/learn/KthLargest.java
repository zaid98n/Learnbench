package learn;

import java.util.Arrays;

public class KthLargest {
	
	public static String K_LargestValue(int[] arr, int k) {
		
		Arrays.sort(arr);
		
		int num;
		String err = "Incorrect index";
		if(k==(arr.length-1)) {
			num = arr[(arr.length-1)-k];
			return Integer.toString(num);
		}
		else {
			return err;
		}
		
	}
	
	public static void main(String[] args) {
		int[] array_1 = { 1, 5, 11, 15, 30, 4, 40, 50};
		System.out.println(K_LargestValue(array_1, 7));
	}

}
