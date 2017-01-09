

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class CalculosComData {

	public static void main(String[] args) {

		LocalDateTime hoje = LocalDateTime.now();
		LocalDateTime amanha = hoje.plusDays(1);
		LocalDateTime ontem = hoje.minusDays(1);

		System.out.println("hoje: " + hoje);
		System.out.println("amanha: " + amanha);
		System.out.println("ontem: " + ontem);
		
		System.out.println("teste plusDays -1: " + hoje.plusDays(-1));
		
		MonthDay natalSemAno = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natal = natalSemAno.atYear(Year.now().getValue());
		
		System.out.println(natalSemAno);
		System.out.println(natal);
		
		System.out.println("faltam " + LocalDate.now().until(natal, ChronoUnit.DAYS) + " dias para o natal");
	
		TemporalAdjuster ajutador = TemporalAdjusters.next(DayOfWeek.FRIDAY);
		
		LocalDate diaDeMaldade = LocalDate.now().with(ajutador);
		System.out.println("proximo dia de maldade: " + diaDeMaldade);
		
		System.out.println("faltam " + LocalDate.now().until(diaDeMaldade, ChronoUnit.DAYS) + " dias para sexta");
		
	}

}
