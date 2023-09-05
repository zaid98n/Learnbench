package learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Without_Repeating_Chars {
	
	public static List<Character> sequence(String str) {
		
		List<Character> lst = new ArrayList<>();
//		int count=0;
//		
//		for(int i=0; i<=str.length()-1; i++) {
//			for(int j=0; j<=str.length()-1; j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count = count+1;
//				}	
//			}
//			if(count==1) {
//				lst.add(Character.toString(str.charAt(i)));
//			}
//			count=0;
//		}
//		return lst;
		
		Map<Character, Integer> countMap = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0)+1);
		}
		
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
        	
        	if(entry.getValue()==1) {
        		lst.add(entry.getKey());
        	}
        }
        
        return lst;

	}
	
	public static void main(String[] args) {
		System.out.println(sequence("aabcccdeef"));
	}
}
