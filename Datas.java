

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;

public class Datas {

	public static void main(String[] args) {
		
		Instant agora = Instant.now();
		System.out.println(agora);
		Duration duration = Duration.between(agora, Instant.now());
		System.out.println(duration.toMillis());
		
		System.out.println(LocalDate.now());
		LocalDate start = LocalDate.of(1982, Month.FEBRUARY, 11);
		System.out.println(start);
		
		Period taVeio = Period.between(start, LocalDate.now());
		
		System.out.printf("ta veio: anos: %s meses: %s dias: %s \n", taVeio.getYears(), taVeio.getMonths(), taVeio.getDays());
		
		LocalTime entrada = LocalTime.of(9, 0);
		
		System.out.println("chegou as: " + entrada);
		
		Duration d = Duration.between(entrada, LocalTime.now());
		System.out.println("No trabalho: " + LocalTime.ofNanoOfDay(d.toNanos()));
		
		LocalDateTime dataHoraNow = LocalDateTime.now();
		
		System.out.println(dataHoraNow);
		
		LocalDateTime dia_do_7x1 = LocalDateTime.of(2014, Month.JULY, 8, 17, 0);
		System.out.println("7 X 1 - " + dia_do_7x1);
		
		System.out.println("natal: " + MonthDay.of(Month.DECEMBER, 25));
		
	}

}
