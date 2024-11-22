package _241115_date_time;
import java.time.LocalDate;

// 달력 만들기
public class PrintCalendar {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate dateOf = LocalDate.of(1997, 10, 05);
		
		Calendar calendar0 = new Calendar(date);
		Calendar calendar1 = new Calendar(dateOf);
		calendar0.printCalendar();
		System.out.println();
		calendar1.printCalendar();
	}

}
