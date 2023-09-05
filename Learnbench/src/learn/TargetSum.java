package learn;

//import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TargetSum {
	
	public static void findNums(int[] arr, int sum) {
		
		//Map<Integer, Integer> nums = Collections.synchronizedMap(new HashMap<>());
		Map<Integer, Integer> nums = new HashMap<>();
		StringBuilder s = new StringBuilder();
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if((arr[i]+arr[j])==sum) {
					nums.put(i, arr[i]);
					nums.put(j, arr[j]);
					s.append(arr[i]+" + "+arr[j]+" = "+sum);
				}
			}
			s.append("\n");
		}
		
		System.out.println(nums);
		System.out.println(s.toString());
		
	}
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		findNums(ar, 6);
	}

}
