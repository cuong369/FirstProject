package project7;

public class FindDayOfWeek {

	static int findDayOfWeek(int day, int month, int year) {
		int JMD;
		JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5)
				+ (365 * (year + 4800 - ((14 - month) / 12))) + ((year + 4800 - ((14 - month) / 12)) / 4)
				- ((year + 4800 - ((14 - month) / 12)) / 100) + ((year + 4800 - ((14 - month) / 12)) / 400) - 32045)
				% 7;

		return JMD;
	}
}
