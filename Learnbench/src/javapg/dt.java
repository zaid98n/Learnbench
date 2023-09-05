package javapg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dt {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date date = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		String strDate= formatter.format(date);  
		System.out.println(strDate);

	}

}
