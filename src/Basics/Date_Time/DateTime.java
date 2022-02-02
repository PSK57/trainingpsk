package Basics.Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {

	public static void main(String args[]) {

		System.out.println(
				(System.currentTimeMillis() / 1000 / 3600 / 24 / 365) + " Years have passed since 1 Jan, 1970.");
		System.out.println((System.currentTimeMillis() / 1000 / 3600 / 24) + " Days have passed since 1 Jan, 1970.");
		System.out.println((System.currentTimeMillis() / 1000 / 3600) + " Hours have passed since 1 Jan, 1970.");
		System.out.println((System.currentTimeMillis() / 1000 / 60) + " Minutes have passed since 1 Jan, 1970.");
		System.out.println((System.currentTimeMillis() / 1000) + " Seconds have passed since 1 Jan, 1970.");
		System.out.println((System.currentTimeMillis()) + " MilliSeconds have passed since 1 Jan, 1970.");
		System.out.println("You saw the Value of Time...");

		LocalDate D = LocalDate.now();
		System.out.println(D);

		LocalDate D2 = LocalDate.of(1999, Month.AUGUST, 16);
		System.out.println(D2);

		LocalTime T = LocalTime.now();
		System.out.println(T);

		LocalDateTime DT = LocalDateTime.now();
		System.out.println(DT);

		Instant I = Instant.now();
		System.out.println(I);
	}
}
