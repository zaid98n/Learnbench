package learn;

public class Isogram {
	
	public static boolean isIsogram(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<=ch.length-1; i++) {
			
			for(int j=i+1; j<=ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					return false;
				}
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isIsogram("helo"));
	}

}
