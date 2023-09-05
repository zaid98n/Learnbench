package learn;

public class LeapYear {
	
//	If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//	If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//	If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//	The year is a leap year (it has 366 days).
//	The year is not a leap year (it has 365 days).
	
	public static boolean isLeap(int year) {
		if(year%4==0) {
			if (year%100==0) {
				if(year%400==0) {
					return true;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isLeap(2012));
	}

}
