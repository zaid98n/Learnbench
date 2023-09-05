package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

	public static List<Integer> subSeq(int[] arr) {

		Arrays.sort(arr);
		
		List<Integer> arrList = new ArrayList<>();

		for (int i = 0; i <= (arr.length - 2); i++) {
			arrList.add(arr[i + 1] - arr[i]);
		}
		
		int mostFrequentElement=0;
		int maxOccurrences=1;
		int occurence=1;
		
		for(int i=0; i<=arrList.size()-1; i++) {
			for(int j=i+1; j<=arrList.size()-1; j++) {
				if(arrList.get(i)==arrList.get(j)) {
					maxOccurrences=maxOccurrences+1;
				}
			}
			if(occurence < maxOccurrences) {
				occurence=maxOccurrences;
				mostFrequentElement=arrList.get(i);
			}
		}

		//System.out.println(mostFrequentElement);
		
		List<Integer> subList = new ArrayList<>();
		//int lastAdded = 0;
		for(int j=0; j<=arr.length - 2; j++) {
			//if(lastAdded == 0 || (arr[j] - lastAdded) == mostFrequentElement ||  (arr[j+1] - lastAdded) == mostFrequentElement)
			if((arr[j + 1] - arr[j])==mostFrequentElement) {
				if(!subList.contains(arr[j])) {
					subList.add(arr[j]);
					//lastAdded = arr[j];
				}
				if(!subList.contains(arr[j+1])) {
					subList.add(arr[j+1]);
					//lastAdded = arr[j+1];
				}
			}
		}
		
		return subList;
	}

	public static void main(String[] args) {
		int[] array_1 = { 1, 5, 11, 15, 30, 4, 40, 50}; // 1,4,5,11,15,30,40,50,100
		int[] array_2 = { 1, 8, 2, 3, 9, 4, 11, 10, 12 };
		System.out.println(subSeq(array_1));
		System.out.println(subSeq(array_2));
	}
}
