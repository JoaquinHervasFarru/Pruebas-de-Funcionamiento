import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Pruebas {

	public static void main(String[] args) {
		String dateInput = "09 01 1990";
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MM yyyy");
		LocalDate formatted = LocalDate.parse(dateInput, formatter);

		DayOfWeek day = formatted.getDayOfWeek();

		System.out.println(day);
		
	}

}
