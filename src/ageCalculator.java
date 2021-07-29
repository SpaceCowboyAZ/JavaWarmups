import java.time.LocalDate;
import java.time.Period;

public class ageCalculator {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1997, 8, 18);
		int years = Period.between(birthDate, today).getYears();
		int months = Period.between(birthDate, today).getMonths();
		
		System.out.println(today);
		System.out.println(birthDate);
		
		System.out.println(years + "years");
		System.out.println(months + "months");
	}

}
