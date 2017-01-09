

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatasComFuso {

	public static void main(String[] args) {
		
		ZoneId zoneSP = ZoneId.of("America/Sao_Paulo");
		ZoneId zoneNY = ZoneId.of("America/New_York");
		
		ZonedDateTime agora = ZonedDateTime.now(zoneSP);
		System.out.println(agora);
		
		LocalDateTime inicioAlmoco = LocalDateTime.of(2017, Month.JANUARY, 4, 12, 00, 00, 00);
		LocalDateTime saidaAlmoco = LocalDateTime.of(2017, Month.JANUARY, 4, 13, 00, 00, 00);
		
		ZonedDateTime inicioAlmocoComFuso = ZonedDateTime.of(inicioAlmoco, zoneSP);
		ZonedDateTime fimAlmocoComFuso = ZonedDateTime.of(saidaAlmoco, zoneNY);
		
		System.out.println(inicioAlmocoComFuso);
		System.out.println(fimAlmocoComFuso);

		System.out.println(Duration.between(inicioAlmocoComFuso, fimAlmocoComFuso).toHours());
		
	}

}
