package project5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidDate {

	static boolean checkDate(String beginDateInput, String endDateInput) throws ParseException {
		// ^((0[1-9])|(1[0-2]))\/((0[1-9])|([1-2][\d])|(3[0-1]))\/\d{4}$
		// ^(0[1-9]|1[0-2])\/(0[1-9]|[1-2][\d]|3[0-1])\/\d{4}$
		// ^(1[0-2]|0[1-9])\/(3[01]|[12][0-9]|0[1-9])\/[0-9]{4}$
		// regex theo "mm/dd/yyyy" hoặc "mm-dd-yyyy"
		// ^(0[1-9]|1[0-2])(\/|-)(0[1-9]|[1-2][\d]|3[0-1])(\/|-)\d{4}$
		Pattern pattern = Pattern.compile("^(0[1-9]|1[0-2])\\/(0[1-9]|[1-2][\\d]|3[0-1])\\/\\d{4}$");
		Matcher matcher1 = pattern.matcher(beginDateInput);
		Matcher matcher2 = pattern.matcher(endDateInput);

		if (matcher1.matches() && matcher2.matches())
			return true;

		return false;
	}

	static boolean compareDate(String beginDate, String endDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		Date dateBegin = sdf.parse(beginDate);
		Date dateEnd = sdf.parse(endDate);
		
		if(dateBegin.compareTo(dateEnd) < 0)
			return true;
		return false;
	}

	static boolean isValidDate(int d, int m, int y) {
		boolean check = false;
		if (y > 0 && (d > 0 && d < 32) && (m > 0 && m < 13)) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (d <= 31)
					check = true;
				else
					System.out.println("Date must <= 31");
			} else if (m == 2) {
				if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
					if (d <= 29)
						check = true;
					else
						System.out.println("Date must <= 29");
				} else {
					if (d <= 28)
						check = true;
					else
						System.out.println("Date must <= 28");
				}
			} else {
				if (d <= 30)
					check = true;
				else
					System.out.println("Date must <= 30");
			}
		}
		return check;
	}

}
