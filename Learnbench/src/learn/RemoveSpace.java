package learn;

public class RemoveSpace {
	
	public static String spaceRemoval(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)!=' ') {
				sb.append(str.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s = "Zaid Nezam        is an Autom ation Engi ne      er";
		System.out.println(spaceRemoval(s));
	}

}
