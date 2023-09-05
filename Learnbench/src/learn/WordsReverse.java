package learn;

import java.util.ArrayList;
import java.util.List;

public class WordsReverse {
	
	public static List<String> reverse(String Str) {
		
		String[] strArray = Str.split(" ");
		
		List<String> reversedWords = new ArrayList<>();
		
		for(int i=strArray.length-1; i>=0; i--) {
			reversedWords.add(strArray[i]);
		}
		
		return reversedWords;
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("How are you"));
	}

}
