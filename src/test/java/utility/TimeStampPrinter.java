package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampPrinter {

	public static String getCurrentTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH mm ss msec");
		LocalDateTime now = LocalDateTime.now();
		String value = dtf.format(now);
		
		

		return value;
	}

	public static void main(String[] args) {
		
		
		System.out.println(getCurrentTime());
	}

}
