import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.of(2020, 4, 25, 11, 20);
		
		LocalDateTime flight1 = LocalDateTime.of(2020, 5, 14, 11, 15);
		
		LocalDateTime flight2 = LocalDateTime.of(2020, 5, 13, 15, 30);
		
		LocalDateTime myflight;
		if(flight1.isBefore(flight2))
			myflight = flight1;
		else
			myflight = flight2;
		
		Period day = Period.between(today.toLocalDate(), myflight.toLocalDate());
		
		Duration time = Duration.between(today.toLocalTime(), myflight.toLocalTime());
		
		System.out.println(day);
		System.out.println(time);
	}
}
