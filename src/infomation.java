import java.time.LocalDate;
import java.time.Period;

class infomation {
	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		
		LocalDate mt = LocalDate.of(dt.getYear(),6,5);
	
		Period pr = Period.between(dt, mt);	
		System.out.println(pr);
	}
}
