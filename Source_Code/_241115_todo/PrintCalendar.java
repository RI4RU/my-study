package _241115_date_time;
import java.time.LocalDate;

// 달력 만들기
public class PrintCalendar {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		Calendar calendar = new Calendar(date);
		calendar.printCalendar();
	}

}
