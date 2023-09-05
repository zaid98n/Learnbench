package learn;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	
	public static List<String> remove(List<String> lst, String ele) {
		
		for(int i=0; i<=lst.size()-1; i++) {
			if(lst.get(i)==ele) {
				lst.remove(i);
			}
		}
		
		return lst;
		
	}
	
	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("hello");
		ls.add("world");
		ls.add("lorem");
		ls.add("ipsum");
		System.out.println("Original List: " + ls);
		System.out.println(remove(ls, "lorem"));
	}

}
