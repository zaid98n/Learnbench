package learn;

import java.util.HashMap;
import java.util.Map;

public class count_Occurence_of_All_Chars {
	
	public static void countTheOccurence(String str) {
		
		Map<Character, Integer> countMap = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0)+1);
		}
		
		StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            output.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(output.toString());
		
	}
	
	public static void main(String[] args) {
		countTheOccurence("abcdabcdabcd");
	}

}
