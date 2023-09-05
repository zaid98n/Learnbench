package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSequence {
	
	public static List<Integer> longestSeq(int[] arr) {
		Arrays.sort(arr);
		List<Integer> newArr = new ArrayList<>();
		
		

		//newArr.add(arr[0]);
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr.length-1);
			System.out.println(i);
			if((arr.length-1) >= i) {
				
			}
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] x = {1, 9, 3, 10, 4, 20, 2};
		System.out.println(longestSeq(x));
	}

}
