package learn;

import java.util.ArrayList;
import java.util.List;

public class Substring {
	
	public static int countSubstring(String[] arr) {
		
		List<String> lst = new ArrayList<>();
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr.length-1; j++) {
				if(arr[i].contains(arr[j]) && arr[i]!=arr[j] && !lst.contains(arr[j])) {
					lst.add(arr[j]);
				}
			}
		}
		System.out.println(lst);
		return lst.size();
	}
	
	public static void main(String[] args) {
		String[] arr = {"superman", "spiderman", "man", "thing", "spider"};
		System.out.println(countSubstring(arr));
	}

}
