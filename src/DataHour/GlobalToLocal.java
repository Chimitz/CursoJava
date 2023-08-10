package DataHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GlobalToLocal {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-08-05");
		LocalDateTime d02 = LocalDateTime.parse("2023-08-05T19:34");
		Instant d03 = Instant.parse("2023-08-05T19:35:23Z");

		LocalDate case1 = d03.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDate();
		LocalDateTime case2 = d03.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDateTime();
		
		System.out.println(case1);
		System.out.println(case2);
		System.out.println();
		System.out.println("d01 Day = " + d01.getDayOfMonth());
		System.out.println("d01 Month = " + d01.getDayOfMonth());
		System.out.println("d01 Year = " + d01.getDayOfYear());
		System.out.println();
		System.out.println("d02 Hour = " + d02.getHour()); 
		System.out.println("d02 Minutes = " + d02.getMinute());
		System.out.println();
		
		Instant postTime = Instant.now();
		LocalDateTime postTimeConvert = postTime.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDateTime();
		LocalDate postLocalDate = postTimeConvert.toLocalDate();
		System.out.println("Posted at " + postTimeConvert.getHour() + ":" + postTimeConvert.getMinute() + " of " + postLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
	}
}
