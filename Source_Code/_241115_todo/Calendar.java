package _241115_date_time;
import java.time.*;

public class Calendar {
	private LocalDate date;
	
	public Calendar(LocalDate date) {
		this.date = date;
	}
	
	public void printCalendar() {
		LocalDate firstday = date.withDayOfMonth(1);
		
		System.out.println("날짜: " + date);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int t = 0; t < firstday.getDayOfWeek().getValue(); t++) {
			System.out.print("\t");
		}
		for (int i = 0; i < firstday.lengthOfMonth(); i = i+7) {
			for(int j = 1; j <= 7; j++) {
				
				if ((i + j) > 0 && (i + j) <= firstday.lengthOfMonth()) {
					System.out.print((i + j) + "\t");
				}
				
			}
			System.out.println();
		}
	}
}
