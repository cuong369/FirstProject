package project5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FindSaturdays {

	private static List<LocalDate> allDates = new ArrayList<LocalDate>();

	static boolean findSat(int day, int month, int year) {
		int JMD;
		JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5)
				+ (365 * (year + 4800 - ((14 - month) / 12))) + ((year + 4800 - ((14 - month) / 12)) / 4)
				- ((year + 4800 - ((14 - month) / 12)) / 100) + ((year + 4800 - ((14 - month) / 12)) / 400) - 32045)
				% 7;

		if (JMD == 5)
			return true;
		return false;
	}

	static List<LocalDate> getDates(String startDate, String endDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate beginDate = LocalDate.parse(startDate, formatter);
		LocalDate EndingDate = LocalDate.parse(endDate, formatter);

		while (!beginDate.isAfter(EndingDate)) {
			allDates.add(beginDate);
			beginDate = beginDate.plusDays(1);
		}

		return allDates;
	}

	static void calculatesSatDate() {
		boolean check = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		for (LocalDate i : allDates) {
			int day = i.getDayOfMonth();
			int month = i.getMonthValue();
			int year = i.getYear();
			check = FindSaturdays.findSat(day, month, year);
			if (check) {
				System.out.println(i.format(formatter));
			}
		}
	}

}
