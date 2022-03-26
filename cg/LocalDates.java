package cpgg.cg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDates {
	public static void main(String[] args) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date="16/03/2022";
		Date d=new Date();
		System.out.println(d);
		LocalDate localDate=LocalDate.parse(date,formatter);
		System.out.println("parsed local date: "+localDate);
		System.out.println("formatted local date: "+formatter.format(localDate));
	}

}
