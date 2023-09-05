package learn;

import java.util.ArrayList;
import java.util.List;

public class PrimeSum {

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int primeSum(int start, int end) {
		
		List<Integer> arrList = new ArrayList<>();
		
		for(int i = start; i<=end; i++) {
			if(isPrime(i)==true) {
				arrList.add(i);
			}
		}
		
		int sum = 0;
		
		for(int ele : arrList) {
			sum = sum + ele;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(primeSum(0, 10));
	}
}















