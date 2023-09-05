package seleniumpg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bomb {
	
	public static void main(String[] args) throws IOException {
		
		//Date Date = new Date();
		FileWriter fstream = new FileWriter("D:\\Florida Press Report\\bomb.txt",true);
		BufferedWriter out = new BufferedWriter(fstream);
		for(int i=1; i<=1000000000; i++) {
		out.write("this is a notepad file");
		}
		out.close();
		System.out.println("completed");
	}
}
