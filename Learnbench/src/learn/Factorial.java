package learn;

import java.math.BigInteger;

public class Factorial {
	
	public static BigInteger factorialResult(int num) {
		
//		int result = 1;
//		
//		for(int i=1; i<=num; i++) {
//			result = result * i;
//		}
		
		BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
		
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorialResult(100));
	}

}
