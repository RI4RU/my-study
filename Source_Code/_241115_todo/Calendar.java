package _241115_date_time;
import java.time.*;

public class Calendar {
	private LocalDate date;
	
	public Calendar(LocalDate date) {
		this.date = date;
	}
	
	public void printCalendar() {
		System.out.println(date.getYear() + " " + date.getMonth().toString());
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		
		for(int t = 0; t < (date.withDayOfMonth(1).getDayOfWeek().getValue() % 7); t++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= date.lengthOfMonth(); i++) {
				if (i <= date.lengthOfMonth()) {
					System.out.print(String.format("%02d", i) + "\t");
				}
				if (date.withDayOfMonth(i).getDayOfWeek().getValue() == 6) {
					System.out.println();
				}
		}
	}
}
