package javapg;

import java.util.Arrays;

public class Sequence {
	
//	public static int missigInt(int[] arr) {
//		
//		Arrays.sort(arr);
//		
//		for(int i=0; i<=arr.length-1; i++) {
//			if(arr[i+1]!=arr[i]+1) {
//				return arr[i]+1;
//			}
//		}
//		return 0;
//		
//	}
	
	public static int missigInt(int[] arr, int n) {
		int sum = (n*(n+1)) / 2;
		int arSum = 0;
		for(int arrayValue : arr) {
			arSum = arSum + arrayValue;
		}
		int num = sum - arSum;
		return num;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 2};
		System.out.println(missigInt(array, 5));
	}

}

