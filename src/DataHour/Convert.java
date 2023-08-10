package DataHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convert {

	public static void main(String[] args) {
		
		LocalDate dataLocal = LocalDate.parse("2023-08-05");
		LocalDateTime dataHourLocal = LocalDateTime.parse("2023-08-05T16:18");
		Instant globalInstant = Instant.parse("2023-08-05T19:23:22Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println(dataLocal.format(fmt1));
		System.out.println(fmt1.format(dataLocal));
		System.out.println(dataLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(fmt2.format(dataHourLocal));
		System.out.println(fmt3.format(globalInstant));
		System.out.println(dataHourLocal.format(fmt4));
		System.out.println(fmt5.format(globalInstant));
		
		
	}

}
