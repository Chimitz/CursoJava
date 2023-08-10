package DataHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SocialMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String username; String password; String password2;
		Instant time = Instant.now();
		
		System.out.println("Creating account:");
		System.out.println();
		System.out.print("Username: ");
		username = sc.nextLine();
		System.out.print("Password: ");
		password = sc.nextLine();
		System.out.print("Confirm Password: ");
		password2 = sc.nextLine();
		
		while(!password.equals(password2)) {
			System.out.println("Password missmatch, try again:");
			System.out.print("Confirm Password: ");
			password2 = sc.nextLine();
			time = Instant.now();
		}
		
		LocalDate datelocal = time.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDate();
		LocalDateTime datehour = time.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDateTime();
		
		System.out.println("Account " + username + ", created at " + datehour.getHour() + ":" + datehour.getMinute()
		+ " - " + datelocal.format(DateTimeFormatter.ofPattern("dd MMM yy")));

		sc.close();
	}
}
