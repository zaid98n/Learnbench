package learn;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
	
	public static boolean isPerfect(int num) {
		
		List<Integer> arrList = new ArrayList<>();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				arrList.add(i);
			}
		}
		
		//System.out.println(arrList);
		
		int sum = 0;
		for(int j=0; j<=arrList.size()-2; j++) {
			sum = sum + arrList.get(j);
		}
		
		//System.out.println(sum);
		
		if(sum==num) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=10000; i++) {
			if(isPerfect(i)==true) {
				System.out.println(i+" is a Perfect Number");
			}
		}
	}
}
