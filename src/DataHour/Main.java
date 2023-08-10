package DataHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDate dataLocal = LocalDate.parse("2023-08-05");
		LocalDateTime dataHourLocal = LocalDateTime.parse("2023-08-05T17:56:23");
		Instant globalInstant = Instant.parse("2023-08-05T17:56:23Z");
		
		System.out.println(dataLocal);
		System.out.println(dataHourLocal);
		System.out.println(globalInstant);
		
		System.out.println();
		
		LocalDate dataLocalFormatted = LocalDate.parse("05/08/2023", fmt1);
		LocalDateTime dataHourLocalFormatted = LocalDateTime.parse("05/08/2023 16:04:10", fmt2);
		
		
		System.out.println(dataLocalFormatted);
		System.out.println(dataHourLocalFormatted);
	}

}
