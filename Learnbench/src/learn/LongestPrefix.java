package learn;

import java.util.HashMap;
import java.util.Map;

public class LongestPrefix {
	
	public static void printPrefix(String[] arr) {
		
		Map<String, String> dynamicVariables = new HashMap<>();
		
		for(int i=0; i<=arr.length-1; i++) {
			String variableName = "str_" + i;
            String value = arr[i];

            dynamicVariables.put(variableName, value);
		}
		String variableName = "str_1";
		System.out.println(dynamicVariables.get(variableName));
		
		for(int j=0; j<=arr.length-1; j++) {
			
		}
		
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"hello", "world"};
		printPrefix(arr1);
	}
}
