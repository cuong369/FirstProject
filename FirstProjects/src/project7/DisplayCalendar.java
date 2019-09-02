package project7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputTime = "";
		System.out.print("Enter month - year: ");
		inputTime = sc.nextLine();
		Pattern pattern = Pattern.compile("^(0[1-9]|[12][\\d]|3[0-1])\\/\\d{4}$");
		Matcher matcher = pattern.matcher(inputTime);
		while (matcher.matches() == false) {
			System.out.println("Re-enter month - year");
			System.out.print("Enter month - year: ");
			inputTime = sc.nextLine();
			matcher = pattern.matcher(inputTime);
		}
		int month = Integer.parseInt(inputTime.split("/")[0]);
		int year = Integer.parseInt(inputTime.split("/")[1]);

		ShowCalendar.showCalendar(month, year);

		sc.close();
	}
}
