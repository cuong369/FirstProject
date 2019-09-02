package project7;

public class DayOfMonth {

	private static int d = 0;
	
	static int dayOfMonth(int m, int y) {
		if (y > 0 && (m > 0 && m < 13))
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				d = 31;
			else if (m == 2)
				if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
					d = 29;
				else
					d = 28;
			else
				d = 30;
		return d;
	}
}
