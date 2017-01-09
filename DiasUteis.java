

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DiasUteis {

	public static void main(String[] args) {
		
		YearMonth anoMes = YearMonth.of(2017, 1);
		
		List<LocalDate> diasUteis = Stream.iterate(anoMes.atDay(1),  data -> data.plusDays(1))
														.limit(anoMes.lengthOfMonth())
														.filter(data -> !data.getDayOfWeek().equals(DayOfWeek.SATURDAY) && 
																		!data.getDayOfWeek().equals(DayOfWeek.SUNDAY))
														.collect(Collectors.toList());

		/*
		diasUteis.forEach((dia) -> { 
			if(dia.getDayOfWeek().equals(DayOfWeek.FRIDAY))
				System.out.println(dia + " - dia de maldade");
			else
				System.out.println(dia);
			}
		);
		*/
		
		diasUteis.forEach((dia) ->  System.out.println(dia.getDayOfWeek().equals(DayOfWeek.FRIDAY) ? dia + " - dia de maldade" : dia));
		
	}

}
