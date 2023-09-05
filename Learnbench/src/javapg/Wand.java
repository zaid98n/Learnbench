package javapg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wand {

	public static void main(String args[]) throws Exception {
		
//		int x = 0;
//		int y = 0;
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		
		int M = scanner.nextInt();

		int[] arrayValues = new int[N];
		for (int i = 0; i < N; i++) {
			arrayValues[i] = scanner.nextInt();
		}
		int[] queryValues = new int[M];
		for (int i = 0; i < M; i++) {
			queryValues[i] = scanner.nextInt();
		}

		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		int[] y1 = new int[M];
		
//		System.out.println(queryValues.length);
//		System.out.println(arrayValues.length);
		
		for (int j = 0; j < queryValues.length; j++) {
			
			//int query = queryValues[j];
			
			for (int i = 0; i < arrayValues.length; i++) {
		         if(arrayValues[i] < queryValues[j]){
		            x.add(queryValues[j] - arrayValues[i]);
		         }
		         else if(arrayValues[i] > queryValues[j]){
		            x.add(arrayValues[i] - queryValues[j]);
		         }
		         //System.out.println("For the first query, queries[" + j + "] = " + (x + y));
			}
			int data = sum(x);
			
			y.add(data);
			data = 0;
			x.clear();
		}
		for(int k=0; k<=y.size()-1; k++) {
			System.out.print(y.get(k) + " ");
		}
		
	}
	
	private static int sum(List<Integer> arr) {
		int sum = 0;
	    for (int i: arr) {
	        sum += i;
	    }
	    return sum;
	}
}
