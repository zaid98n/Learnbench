package learn;

import java.util.Arrays;

public class MaxMinArray {
	
	public static int max(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	public static int min(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public static void main(String[] args) {
		int[] x = {5, 4,7,9, 2, 1, 8, -4};
		
		System.out.println("Maximum value: " + max(x));
		System.out.println("Minimum value: " + min(x));
	}

}
