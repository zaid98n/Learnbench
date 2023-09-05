package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//int[] arr = { 1, 5, 11, 15, 30, 4, 70, 80, 40, 50 };
		//int arr[] = {2,1,26,24,3,25,45,27,28};
		//int arr[] = {2,1,4,3,5,6};
		//int[] arr = { 1, 8, 2, 3, 9, 4, 11, 10, 12 };
		int[] arr = { 1, 5, 11, 15, 30, 4, 40, 50};

		Arrays.sort(arr);

		int prevDiff = 0;

		List<Integer> finalList = new ArrayList<>();

		List<Integer> fakeList = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1]) - arr[i] == prevDiff) {
				if (!fakeList.contains(arr[i]))
					fakeList.add(arr[i]);
				if (!fakeList.contains(arr[i + 1]))
					fakeList.add(arr[i + 1]);
			} else {
				if (finalList.size() < fakeList.size()) {
					finalList = fakeList;
				}
				fakeList = new ArrayList<>();
				fakeList.add(arr[i]);
			}
			prevDiff = (arr[i + 1]) - arr[i];
		}

		if (finalList.size() < fakeList.size()) {
			finalList = fakeList;
		}

		for (int dig : finalList) {
			System.out.print(dig + " ");
		}
	}

}
