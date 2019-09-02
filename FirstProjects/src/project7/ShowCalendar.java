package project7;

public class ShowCalendar {

	public static void showCalendar(int month, int year) {
		String[] showDay = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

		for (String i : showDay) {
			if (!"Sun".equals(i))
				System.out.print(i + "\t");
			else
				System.out.println(i);
		}

		int tempBegin = FindDayOfWeek.findDayOfWeek(1, month, year);
		int day = DayOfMonth.dayOfMonth(month, year);

		String[][] daysOfMonth = new String[5][7];
		int begin = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (j < tempBegin && i == 0)
					daysOfMonth[i][j] = "";
				else {
					if (begin <= day) {
						daysOfMonth[i][j] = String.valueOf(begin++);
					} else {
						daysOfMonth[i][j] = "";
					}
				}
				System.out.print(daysOfMonth[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
