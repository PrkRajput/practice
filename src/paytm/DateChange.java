package paytm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChange {
	public static void main(String args[]) throws ParseException {
		String strDate = "20190131154824";
		String date1=null;			
		// input date format
		SimpleDateFormat df_in = new SimpleDateFormat("yyyyMMddhhmmss");
		// output date format
		SimpleDateFormat df_output = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df_in.parse(strDate);
		date1 = df_output.format(date);		
		System.out.println(date1);
	}
}
