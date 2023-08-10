package DataHour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {
		
			
		LocalDate d1 = LocalDate.parse("2023-08-05");
		LocalDateTime d2 = LocalDateTime.parse("2023-08-05T20:32");
		Instant d3 = Instant.parse("2023-08-05T20:32:21Z");
		
		LocalDate pastWeekLocalDate = d1.minusDays(7);
		LocalDate nextWeekLocalDate = d1.plusDays(7);
		System.out.println("Past Week LocalDate = " + pastWeekLocalDate);
		System.out.println("Original Week = " + d1);
		System.out.println("Next Week LocalDate = " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d2.plusDays(7);
		System.out.println("Past Week LocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("Original Week = " + d2);
		System.out.println("Next Week LocalDateTime = " + nextWeekLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
		System.out.println("Past Week Instant = " + pastWeekInstant);
		System.out.println("Original Week = " + d3);
		System.out.println("Next Week Instant = " + nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekInstant, d3);
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), d1.atStartOfDay()); /// can use both
		
		System.out.println("Day between pastWeek and D3 = " + t1.toDays());
		System.out.println("Day between pastWeek and D1 = " + t2.toDays());

	}

}
