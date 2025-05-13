package infosys;

import java.time.LocalDate;

public class today_date_m_y {
	public static void main(String[] args) {
		LocalDate test=LocalDate.now();
		System.out.println("Date:"+test.getDayOfMonth());
		System.out.println("Month:"+test.getMonth());
		System.out.println("Year:"+test.getYear());
	}

}
