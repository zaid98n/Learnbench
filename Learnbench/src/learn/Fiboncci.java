package learn;

import java.util.ArrayList;
import java.util.List;

public class Fiboncci {
	
	public static List<Integer> series(int num) {
		
		List<Integer> fibonacciSeries = new ArrayList<>();
		fibonacciSeries.add(0);
		fibonacciSeries.add(1);
		
		for(int i=1; i<=num-2; i++) {
			
			fibonacciSeries.add(fibonacciSeries.get(i)+fibonacciSeries.get(i-1));
		
		}
		
		return fibonacciSeries;
		
	}
	
	public static void main(String[] args) {
		System.out.println(series(10));
	}

}
