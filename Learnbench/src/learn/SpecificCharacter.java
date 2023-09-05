package learn;

public class SpecificCharacter {
	
	public static int countChars(String str, char cr) {
		
		int count = 0;
		for(int i=0; i<=str.length()-1 ; i++) {
			if(str.charAt(i) == cr) {
				count = count+1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countChars("Hellollww", 'l'));
	}

}
