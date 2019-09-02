package project5;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		String test = "2017-12-20";
		LocalDate incrementingDate = LocalDate.parse(test);
		System.out.println(incrementingDate.getDayOfMonth());
		System.out.println(incrementingDate.getMonthValue());
		System.out.println(incrementingDate.getYear());
		System.out.println("========");
		String a = "12/20/2017";
		LocalDate b = LocalDate.parse(a);
		System.out.println(b.getDayOfMonth());
		System.out.println(b.getMonthValue());
		System.out.println(b.getYear());
	}
}
