package Date_Time_API;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_Manipulation {

	public static void main(String[] args) {
		
		System.out.println("Date class ....");
		Date currentDate = new Date();
		System.out.println("Current Date : "+currentDate);

		System.out.println("Current Date in ms : "+currentDate.getTime());
		System.out.println("Current Date : ");
		
		Calendar expiryDate = new GregorianCalendar(2017,7,30);
		expiryDate.add(Calendar.MONTH, 9);
		
		System.out.println("New ExpiryDate : "+expiryDate.getTime());
		
		LocalDate birthday = LocalDate.of(1995, 02, 07);
		LocalDate today = LocalDate.now();
		Period period = birthday.until(today);
		System.out.println("Complete Age : "+period.toString());
		System.out.println("Age : "+period.getYears());
	
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Zoned time  : "+zdt.toString());
		
	}

}
