

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DataFormatada {

	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm");
		System.out.println(format.format(agora));

		DateTimeFormatter format2 = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("pt", "BR"));
		System.out.println(format2.format(agora));
		
		ZoneId zonaSP = ZoneId.of("America/New_York");
		ZonedDateTime zoned = ZonedDateTime.of(agora, zonaSP);
		DateTimeFormatter format3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		System.out.println(format3.format(zoned));
		System.out.println(format3.format(agora.atZone(zonaSP)));
		
		System.out.println(LocalDateTime.now().format(format2));
		
	}

}
