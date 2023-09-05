package learn;

public class StringReverse {
	
	public static String srtRevesrse(String str) {
		
		//char[] ch = str.toCharArray();
		StringBuilder strNew = new StringBuilder();
		
		for (int i=str.length()-1; i>=0; i--) {
			strNew.append(str.charAt(i));
		}
		
		return strNew.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(srtRevesrse("zaid"));
	}

}
