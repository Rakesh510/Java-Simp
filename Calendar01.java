package Calender;
import java.util.*;



public class Calendar01 {
	
	public static void main(String[] args) {
		Calendar objCalendar =Calendar.getInstance();
		System.out.println("\n Date and Time Components");
		System.out.println("Year: "+objCalendar.get(Calendar.YEAR)+" Month: "+objCalendar.get(Calendar.MONTH)+" Date: "+objCalendar.get(Calendar.DATE));
		System.out.println("Hour: "+objCalendar.get(Calendar.HOUR)+" Minute: "+objCalendar.get(Calendar.MINUTE)+" Second: "+objCalendar.get(Calendar.SECOND));
		
		
	
	}	
}
