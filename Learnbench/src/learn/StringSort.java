package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort {
	
	public static char[] sortStr(String str) {
		
		String strnew = str.toLowerCase();	
		char[] ch = strnew.toCharArray();
		Arrays.sort(ch);
		return ch;
		
	}
	
	public static List<String> sortWords(String str) {
		
		String strNew = str.toLowerCase();
		String[] strArray = strNew.split(" ");
		Arrays.sort(strArray);
		List<String> lst = new ArrayList<>();
		for(int i=0; i<=strArray.length-1; i++) {
			lst.add(strArray[i]);
		}
		
		return lst;
		
	}
	
	public static void main(String[] args) {
		System.out.println(sortStr("Hello"));
		System.out.println(sortWords("Hello how are you"));
	}
	

}